function getRootPath() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	projectName = "/cetp";
	return (localhostPaht + projectName);
};

$(function() {
	uploadify();
});
var idName = "";
function uploadify() {
	$("#file_upload").uploadify(
			{
				'height' : 28,
				'width' : 80,
				'buttonText' : '添加附件',
				'swf' : getRootPath()
						+ '/images/uploadify/uploadify.swf?ver='
						+ Math.random(),
				'uploader' : getRootPath() + '/upload.do',
				'auto' : false,
				'fileSizeLimit' : '512000KB',
				'fileTypeExts' : '*.doc; *.jpg; *.rar',
				'cancelImg' : getRootPath()
						+ '/images/uploadify/uploadify-cancel.png',
				'uploadLimit' : 345,
				'onUploadStart' : function(file) {
					
				},
				'onUploadSuccess' : function(file, data, response) {
					$("#tempFileName").val(file.name);
					$("#" + idName).val(data);
				},
				'onUploadComplete' : function() {
					
				}
			});
}
function startUpload(name) {
	idName = name;
	$('#file_upload').uploadify('upload', '*');
}