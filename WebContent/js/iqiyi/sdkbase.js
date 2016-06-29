(function(global){var _qc={};global.Qiyi=global.Qiyi||{};(function (module){
    
    module["__1"] = window;

})(_qc);
(function ( module) {
    var global = module["__1"];
    var namespace = function(name, module, owner) {
        var packages = name.split('.'),
            len = packages.length - 1,
            packageName, i = 0;

        // 如果没有owner，找当前作用域，如果当前作用域没有此变量，在window创建
        if (!owner) {
            try {
                if (!(new RegExp('^[a-zA-Z_$][a-zA-Z0-9_$]*$')).test(packages[0])) {
                    throw '';
                }
                owner = (new Function("return " + packages[0]))();
                i = 1;
            } catch (e) {
                owner = global;
            }
        }

        for (; i < len; i++) {
            packageName = packages[i];
            if (!owner[packageName]) {
                owner[packageName] = {};
            }
            owner = owner[packageName];
        }

        if (!owner[packages[len]]) {
            owner[packages[len]] = module;
        }
    };

    module["__4"] = namespace;
    
})(_qc);
(function (module){

    var _Object = function(){};
    var proto = new Object();
    proto.superclass = Object;
    proto.__NAME__ = 'Object';
    proto.superinstance = new Object();
    var extend = function (target, source) {
        for (var p in source) {
            if (source.hasOwnProperty(p)) {
                target[p] = source[p];
            }
        }
        return target;
    };
    proto.callsuper = function(methodName){
        var _this = this;
        /* 在一次调用过程中，逐级记录父类引用，保证正确调用父类方法。不支持在异步过程中调用callsuper */
        if(!this._realsuper){
            this._realsuper = this.superclass;
        }
        else{
            this._realsuper = this._realsuper.prototype.superclass;
        }
        if(typeof methodName == 'string'){
            var args = Array.prototype.slice.call(arguments,1);
            _this._realsuper.prototype[methodName].apply(_this,args);
        }
        else{
            var args = Array.prototype.slice.call(arguments,0);
            _this._realsuper.apply(_this,args);

        }
        this._realsuper = null;
    };
    _Object.prototype = proto;
    module["__5"] = _Object;
})(_qc);
(function (module){

    var _ns = module["__4"];
    var _Object = module["__5"];

    var Class = function(name,data){
        var ns = (data.ns) && data.ns + '.' + name;
        if(ns){
            try{
                var exist = (new Function("return " + ns))();
                if(exist)return exist;
            }
            catch(e){};
        }
        var superclass = data.extend || _Object;
        var superproto = function(){};
        var plugins = data.plugins || [];
        superproto.prototype = superclass.prototype;
        var constructor = data.construct || function(){};
        var properties = data.properties || {};
        var methods = data.methods || {};
        var statics = data.statics || {};
        var proto = new superproto();
        for(var key in proto){
            if(proto.hasOwnProperty(key)){
                delete proto[key];
            }
        }
        for(var key in properties){
            proto[key] = properties[key];
        }
        for(var key in methods){
            proto[key] = methods[key];
        }
        for(var i = 0; i < plugins.length; i++){
            var plugin = plugins[i];
            for(var key in plugin){
                proto[key] = plugin[key];
            }
        }
        proto.constructor = constructor;
        proto.superclass = superclass;
        proto.superinstance = new superproto();
        proto.__NAME__ = name;
        constructor.prototype = proto;
        for(var key in statics){
            constructor[key] = statics[key];
        }
        if(ns){
            _ns(ns,constructor);
        }
        return constructor;
    }
    
    module["__3"] = Class;
})(_qc);
(function (module){

    var extend = function (target, source, fn) {
    	fn = fn || function(){
    		return true
    	}
        for (var p in source) {
            if (source.hasOwnProperty(p) && fn(target[p],source[p])) {
                target[p] = source[p];
            }
        }
        return target;
    };
    
    module["__8"] = extend;
})(_qc);
(function (module){

    var parse = function(url){
        var reHost = /(\w+):\/\/([^\/:]+):?(\d*)((?:\/|$)[^?#]*)/;
        var parts = url.match(reHost);
        if(parts){
            var protocol = parts[1];
            var host = parts[2];
            var port = parts[3];
            var path = parts[4];
            return {protocol:protocol,host:host,port:port,path:path};
        }
        
        return null;
    }
    
    module["__13"] = parse;
})(_qc);
(function (module){

    var _parse = module["__13"];

    var isSameDomain = function(surl,durl){
        if(surl.charAt(0) == '/' || durl.charAt(0) == '/'){
            return true;
        }
        var sobj = _parse(surl);
        var dobj = _parse(durl);
        //如果不是一个合法的url地址，也认为是同域请求 Add by piaoshihuang
        if(sobj == null || dobj == null){
            return true;
        }
        return dobj.host == sobj.host && dobj.protocol == sobj.protocol && dobj.port == sobj.port;
    };

    module["__12"] = isSameDomain;
})(_qc);
(function (module){
    var callbacks = {};
    module["__15"] = callbacks;
})(_qc);
(function ( module) {
    var _s = {};
    var _ua = navigator.userAgent.toLowerCase();
    var _plug = navigator.plugins;

    var iPad = _ua.match(/(ipad).*os\s([\d_]+)/),
        iPhone = !iPad && _ua.match(/(iphone\sos)\s([\d_]+)/),
        android = _ua.match(/(Android)\s+([\d.]+)/);

    _s.IE = /msie/.test(_ua);
    _s.OPERA = /opera/.test(_ua);
    _s.MOZ = /gecko/.test(_ua);
    _s.IE6 = /msie 6/.test(_ua);
    _s.IE7 = /msie 7/.test(_ua);
    _s.IE8 = /msie 8/.test(_ua);
    _s.IE9 = /msie 9/.test(_ua);
    _s.SAFARI = /safari/.test(_ua) && !(/chrome/.test(_ua));
    _s.mobileSafari = (/iPhone/i.test(navigator.platform) ||
        /iPod/i.test(navigator.platform) ||
        /iPad/i.test(navigator.userAgent)) &&
        !!navigator.appVersion.match(/(?:Version\/)([\w\._]+)/);
    _s.WEBKIT = /webkit/.test(_ua);
    //_s.winXP=/windows nt 5.1/.test(_ua);
    //_s.winVista=/windows nt 6.0/.test(_ua);
    _s.CHROME = /chrome/.test(_ua);
    _s.iPhone = /iphone os/.test(_ua); //iphone 的检测
    _s.iPod = /iPod/i.test(_ua); //ipod 的检测
    _s.android = /android/.test(_ua); //android 的检测
    _s.iPhone4 = /iphone os [45]_/.test(_ua); //iphone 4的检测
    _s.iPad = /ipad/.test(_ua); // ipad的检测
    _s.WP = /windows phone/.test(_ua);

    _s.baidu = /baidu/.test(_ua); //百度浏览器
    _s.mbaidu = /baidu/.test(_ua); //百度浏览器
    _s.m360 = /360/.test(_ua); //360手机浏览器检测
    _s.muc = /uc/.test(_ua); //uc手机浏览器检测
    _s.mqq = /qq/.test(_ua); //qq浏览器检测

    if (android) {
        _s.version = android[2];
    }
    if (iPhone) {
        _s.ios = true;
        _s.version = iPhone[2].replace(/_/g, ".");
    }
    if (iPad) {
        _s.ios = true;
        _s.version = iPad[2].replace(/_/g, ".");
    }
    if (_s.iPod) {
        _s.ios = true;
    }
    _s.lePad = /lepad_hls/.test(_ua); //联想lePad检测
    _s.Mac = /macintosh/.test(_ua);
    //_s.video = _s.iPad || _s.iPhone || _s.lePad; //iphone、ipad、mac机和lePad的综合检测
    //_s.noFlashAndroid = _s.WEBKIT && _s.android &&
    //(!_plug || !_plug["Shockwave Flash"]);//不支持flash的安卓机器（支持html5Video标签）
    _s.TT = /tencenttraveler/.test(_ua);
    _s.$360 = /360se/.test(_ua);
    _s.ff = /firefox/.test(_ua);
    _s.uc = /uc/.test(_ua);
    //_s.ff4 = /firefox\/4/.test(_ua);
    _s.Maxthon = false;
    try {
        _s.html5Video = !! document.createElement('video').play;
    } catch (e) {
        _s.html5Video = false;
    }
    try {
        var t = window.external;
        _s.Maxthon = t.max_version ? true : false;
    } catch (e) {}
    module["__19"] = _s;
})(_qc);
(function (module){
    
    var isArray = Array.isArray || function(arg){
        return Object.prototype.toString.call(arg) == '[object Array]';
    }

    module["__21"] = isArray;
    
})(_qc);
(function (module){

    var forEach = function (source, iterator) {
        var returnValue, key, item; 
        if ('function' == typeof iterator) {
            for (key in source) {
                if (source.hasOwnProperty(key)) {
                    item = source[key];
                    returnValue = iterator.call(source, item, key);
            
                    if (returnValue === false) {
                        break;
                    }
                }
            }
        }
        return source;
    };
    
    module["__22"] = forEach;
})(_qc);
(function (module){

    var escapeSymbol = function(source) {
        return String(source).replace(/[#%&+=\/\\\ \u3000\f\r\n\t]/g, function(all) {
            return '%' + (0x100 + all.charCodeAt()).toString(16).substring(1).toUpperCase();
        });
    };
    
    module["__23"] = escapeSymbol;
})(_qc);
(function (module){

    var _isArray = module["__21"];
    var _forEach = module["__22"];
    var _escapeSymbol = module["__23"];

    var jsonToQuery = function (json, replacer_opt) {
        var result = [],
            itemLen,
            replacer = replacer_opt || function (value) {
                return _escapeSymbol(value);
            };
            
        _forEach(json, function(item, key){
            if (_isArray(item)) {
                itemLen = item.length;
                while (itemLen--) {
                    result.push(key + '=' + replacer(item[itemLen], key));
                }
            } else {
                result.push(key + '=' + replacer(item, key));
            }
        });
        
        return result.join('&');
    };
    
    module["__20"] = jsonToQuery;
})(_qc);
(function (module){

    var _extend = module["__8"];
    var _ua = module["__19"];
    var _toQuery = module["__20"];

    var swf = function(path,opts){

        var opt = {
            id: null,
            height: 1,
            width: 1,
            styles:{},
            properties: {},
            params: {
                quality: 'high',
                allowScriptAccess: 'always',
                wMode: 'window',
                align: 'middle',
                bgcolor: '#000000',
                swLiveConnect: 'true',
                loop: 'true',
                play: 'true',
                DeviceFont: 'false',
                allowFullScreen: 'true',
                menu: 'true'
            },
            vars: {}
        };

        var id = opts.id || ('swf_' + Date.now().toString(36));
        var params = _extend(opt.params,opts.params || {});
        var vars = _extend(opt.vars,opts.vars || {});
        var styles = _extend(opt.styles,opts.styles || {});

        var properties = (function(){
            _extend(opt.properties,{
                height:opt.height,
                width: opt.width
            },function(t,s){
                if(s){
                    return true;
                }
            });

            _extend(opt.properties,
            opts.properties,
            function(t,s){
                if(s){
                    return true;
                }
            });

            return _extend(opt.properties,{
                    height:opts.height,
                    width: opts.width
                },
                function(t,s){
                    if(s){
                        return true;
                    }
                });
        })();

        params.flashVars = _toQuery(vars,function(value){
            return value;
        });

        if (_ua.IE){
            properties.classid = 'clsid:D27CDB6E-AE6D-11cf-96B8-444553540000';
            params.movie = path;
        }
        else {
            properties.type = 'application/x-shockwave-flash';
        }
        properties.data = path;

        var build = [];
        build.push('<object id="',id,'"');
        for (var property in properties){
            build.push(' ',property,'="',properties[property],'"');
        }
        build.push(' style="');
        for (var style in styles){
            build.push(style,':',styles[style],';');
        }
        build.push('"');
        build.push('>');
        for (var param in params){
            if (params[param]){
                build.push('<param name="',param,'" value="',params[param],'" />');
            }
        }
        build.push('</object>');
        return build.join('');
    };

    module["__18"] = swf;
})(_qc);
(function (module){
    var list = {};
    module["__24"] = {
        set:function(id){
            if(!(id in list)){
                list[id] = document.getElementById(id);
            }
            else{
                throw 'flash对象id有重复！' 
            }
        },
        get:function(id){
            return list[id]
        },
        getAll:function(){
            return list;
        },
        remove:function(id){
            list[id] = null;
            delete list[id];
        }
    }
})(_qc);
(function (module){

    var _create = module["__18"];
    var _list = module["__24"];

    module["__17"] = function(path,opts){
        opts.id = opts.id || 'swf_' + (new Date()*1).toString(36);
        var str = _create(path,opts);
        var div = document.createElement('div');
        div.style.display = 'none';
        div.innerHTML = str;
        var ctn;
        if(opts.container){
            ctn = opts.container[0];
        }
        else{
            ctn = document.body;
        }
        ctn.insertBefore(div.firstChild,null);
        setTimeout(function(){
            _list.set(opts.id);
        },0);
        return opts.id;
    };

})(_qc);
(function ( module) {
    var version = (function() {
        var ver;
        try {
            ver = navigator.plugins['Shockwave Flash'].description;
        } catch (e) {
            try {
                ver = new ActiveXObject('ShockwaveFlash.ShockwaveFlash').GetVariable('$version');
            } catch (e) {

            }
        }
        return (ver || '0 r0').match(/\d+/g);
    })();

    module["__25"] = version;
})(_qc);
(function (module){

    var ready = function() {
        var readyBound = false,
            readyList = [],
            DOMContentLoaded;

        if (document.addEventListener) {
            DOMContentLoaded = function() {
                document.removeEventListener('DOMContentLoaded', DOMContentLoaded, false);
                ready();
            };

        } else if (document.attachEvent) {
            DOMContentLoaded = function() {
                if (document.readyState === 'complete') {
                    document.detachEvent('onreadystatechange', DOMContentLoaded);
                    ready();
                }
            };
        }

        function ready() {
            if (!ready.isReady) {
                ready.isReady = true;
                for (var i = 0, j = readyList.length; i < j; i++) {
                    readyList[i]();
                }
            }
        }

        function doScrollCheck(){
            try {
                document.documentElement.doScroll("left");
            } catch(e) {
                setTimeout( doScrollCheck, 1 );
                return;
            }   
            ready();
        }

        function bindReady() {
            if (readyBound) {
                return;
            }
            readyBound = true;

            if (document.readyState === 'complete') {
                ready.isReady = true;
            } else {
                if (document.addEventListener) {
                    document.addEventListener('DOMContentLoaded', DOMContentLoaded, false);
                    window.addEventListener('load', ready, false);
                } else if (document.attachEvent) {
                    document.attachEvent('onreadystatechange', DOMContentLoaded);
                    window.attachEvent('onload', ready);

                    var toplevel = false;

                    try {
                        toplevel = window.frameElement == null;
                    } catch (e) {}

                    if (document.documentElement.doScroll && toplevel) {
                        doScrollCheck();
                    }
                }
            }
        }
        bindReady();

        return function(callback) {
            ready.isReady ? callback() : readyList.push(callback);
        };
    }();

    ready.isReady = false;

    module["__26"] = ready;
})(_qc);
(function (module){

    var _isArray = module["__21"];

    var queryToJson = function (url) {
        var query   = url.substr(url.lastIndexOf('?') + 1),
            params  = query.split('&'),
            len     = params.length,
            result  = {},
            i       = 0,
            key, value, item, param;

        for (; i < len; i++) {
            if(!params[i]){
                continue;
            }
            param   = params[i].split('=');
            key     = param.shift();
            value   = param.join('=');

            item = result[key];
            if ('undefined' == typeof item) {
                result[key] = value;
            }
            else if (_isArray(item)) {
                item.push(value);
            }
            else {
                result[key] = [item, value];
            }
        }

        return result;
    };

    module["__27"] = queryToJson;
})(_qc);
(function (module){
    var global = module["__1"];
    var __callbacks__ = module["__15"];
    var swfInsert = module["__17"];
    var swfVer = module["__25"];
    var domReady = module["__26"];
    var _queryToJson = module["__27"];

    var swf;
    var id;
    var on = function(){};
    var protocol = window.location.protocol;
    var customUrl = _queryToJson(window.location.search).clear;
    var url = (customUrl || (protocol + "//www.iqiyi.com/player/cupid/common/clear.swf")) + '?r=' + Math.floor(Math.random() * 2147483648).toString(36);
    var list = {};
    var ready = false;

    if(swfVer[0] == '0'){
        return;
    }

    __callbacks__['iqiyi_clear_ready'] = function(){
        ready = true;
        var fn;
        while(list['ready'] && list['ready'].length){
            try{
                fn = list['ready'].shift();
                fn(instance());
            }
            catch(e){
            }
        }
    };

    on = function(type,listener){
        type = type.replace(/^on/i, '');
        type = type.toLowerCase();
        list[type] = list[type] || [];
        if(id && ready){
            listener(instance());
        }
        else{
            list[type].push(listener);
        }
    };

    domReady(function(){
        id = swfInsert(
            url,{
                styles:{
                    position:'absolute',
                    top:'0',
                    left:'0',
                    zIndex:'-999'
                }
            }
        );
    });

    var instance = function(){
        return document.getElementById(id);
    };

    module["__16"] = {
        on:on,
        notice:function(json){
            var swf = instance();
            if(swf && swf.notice){
                swf.notice(JSON.stringify(json));
            }
            else{
                //todo
            }
        },
        //咱们把clear提供的方法都封装起来使用,尽量不使用get方法
        get:function(){
            return instance();
        }
    };
})(_qc);
(function (module){
    var global = module["__1"];
    var __callbacks__ = module["__15"];
    var clear = module["__16"];
    var ns = 'window.Q.__callbacks__.';
    var fn = function(){};

    var swfp = function(url, options) {
        //不做重复检查了，同一浏览器重复的几率太低了
        var callbackNameValue = 'iqiyi__swfp__' + Math.floor(Math.random() * 2147483648).toString(36);

        options.onsuccess = options.onsuccess || fn;
        options.onfailure = options.onfailure || fn;
        options.ontimeout = options.ontimeout || fn;

        __callbacks__[callbackNameValue] = function(data){
            if(data == "A00001"){
                options.ontimeout();
            }
            else if(data == "A00002"){
                options.onfailure();
            }
            else{
                options.onsuccess({
                    responseText:data
                },data);
            }
            delete __callbacks__[callbackNameValue];
        };

        //解决奇谈的奇怪问题
        //接口请求没问题，模板请求会收不到返回数据
        //但是完全一样的代码，在控制台执行，却能拿到返回数据
        //测试加定时器也可以，原因未知。。
        setTimeout(function(){
            clear.notice({
                type: 'remote',
                data:{
                    url : url,
                    method : options.method || 'GET',
                    timeout : options.timeout || 0,
                    param : options.data || {},
                    callback : ns + callbackNameValue
                }
            });
        },0);

    };

    module["__14"] = {
        request:function(){
            var arg = arguments;
            clear.on('ready',function(){
                swfp.apply(null,arg);
            });
        }
    };
})(_qc);
(function ( module) {
    var formatRegExp = /%[sdj%]/g;
    module["__30"] = function(f) {
        if (typeof f !== 'string') {
            var objects = [];
            for (var i = 0; i < arguments.length; i++) {
                objects.push(inspect(arguments[i]));
            }
            return objects.join(' ');
        }

        var i = 1;
        var args = arguments;
        var len = args.length;
        var str = String(f).replace(formatRegExp,
        function(x) {
            if (i >= len) return x;
            switch (x) {
            case '%s':
                return String(args[i++]);
            case '%d':
                return Number(args[i++]);
            case '%j':
                return JSON.stringify(args[i++]);
            case '%%':
                return '%';
            default:
                return x;
            }
        });
        for (var x = args[i]; i < len; x = args[++i]) {
            if (x === null || typeof x !== 'object') {
                str += ' ' + x;
            } else {
                str += ' ' + inspect(x);
            }
        }
        return str;
    };
})(_qc);
(function (module){

    var pad = function(number,length){
        var pre = "",
            negative = (number < 0),
            string = String(Math.abs(number));

        if (string.length < length) {
            pre = (new Array(length - string.length + 1)).join('0');
        }
        return (negative ?  "-" : "") + pre + string;
    };

    module["__32"] = pad;
})(_qc);
(function (module){

    var pad = module["__32"];

    var format = function(date,pattern){
        if ('string' != typeof pattern) {
            return date.toString();
        }

        function replacer(patternPart, result) {
            pattern = pattern.replace(patternPart, result);
        }
        
        var year    = date.getFullYear(),
            month   = date.getMonth() + 1,
            date2   = date.getDate(),
            hours   = date.getHours(),
            minutes = date.getMinutes(),
            seconds = date.getSeconds();

        replacer(/yyyy/g, pad(year, 4));
        replacer(/yy/g, pad(parseInt(year.toString().slice(2), 10), 2));
        replacer(/MM/g, pad(month, 2));
        replacer(/M/g, month);
        replacer(/dd/g, pad(date2, 2));
        replacer(/d/g, date2);

        replacer(/HH/g, pad(hours, 2));
        replacer(/H/g, hours);
        replacer(/hh/g, pad(hours % 12, 2));
        replacer(/h/g, hours % 12);
        replacer(/mm/g, pad(minutes, 2));
        replacer(/m/g, minutes);
        replacer(/ss/g, pad(seconds, 2));
        replacer(/s/g, seconds);

        return pattern;
    };

    module["__31"] = format;
})(_qc);
(function (module){

    var Class = module["__3"];
    var format = module["__30"];
    var extend = module["__8"];
    var global = module["__1"];
    var formatDate = module["__31"];

    var enabled = false;
    var infoStorage = {};
    var infoStorageKey = 'QInfo';
    var data = infoStorage[infoStorageKey] ? JSON.parse(infoStorage[infoStorageKey]) : [];
    var max = 300;
    var modulesToSave = {};
    var keysToPrint = {
        moduleName: '',
        date: '',
        message: '',
        tpl: '',
        level: ''
    };

    var toStr = function(data){
        var args = [data.tpl,data.level,data.moduleName,formatDate(new Date(data.date*1),'yyyy-MM-dd HH:mm:ss')];
        for(var i = 0; i < data.message.length; i++){
            args.push(data.message[i]);
        }
        var infoString = format.apply(null,args);
        return infoString;
    };

    var output = {
        log:function(data){
            if(global.console && console.log){
              //  console.log(toStr(data));
            }
        },
        info:function(data){
            if(global.console && console.info){
                //console.info(toStr(data));
            }
        },
        debug:function(data){
            if(global.console && console.debug){
              //  console.debug(toStr(data));
            }
        },
        warn:function(data){
            if(global.console && console.warn){
                //console.warn(toStr(data));
            }
        },
        error:function(data){
            if(global.console && console.error){
               // console.error(toStr(data));
            }
        },
        flush:function(data){
            this.log(toStr(data));
        }
    };

    var InfoCenter = Class('InfoCenter',{
        construct:function(options){
            options = options || {};
            this._moduleName = options.moduleName || 'Unknown';
            this._tmpl = options.tmpl || '[%s][%s][%s] >>> %s';
            var out = {};
            extend(out,output);
            extend(out,options.output || {});
            this._output = out;
        },
        statics:{
            toStr: toStr,
            enable:function(){
                enabled = true;
            },
            disable:function(){
                enabled = false;
            },
            whatToSave:function(moduleNames){
                if(typeof moduleNames == 'string'){
                    modulesToSave[moduleNames] = true;
                }
                else if(moduleNames && moduleNames.length > 0){
                    moduleNames.forEach(function(moduleName){
                        modulesToSave[moduleName] = true;
                    });
                }
            },
            whatToPrint: function(keys) {
                var map = {};
                for (var key in keys) {
                    keysToPrint[key] = keys[key];
                }
            },
            setStorage:function(storageInfo){
                if (storageInfo.key) {
                    infoStorageKey = storageInfo.key;
                }
                infoStorage = storageInfo.storage;
                if(infoStorage[infoStorageKey]){
                    data = JSON.parse(infoStorage[infoStorageKey]);
                }
                else{
                    data = [];
                }
            },
            setOutput:function(obj){
                extend(output,obj || {});
            },
            flush:function(options){
                options = options || {};
                options = extend({
                    output:function(datas){
                        if(global.console){
                            for (var i = 0; i < datas.length; i++) {
                                datas[i] = toStr(datas[i]);
                            }
                          //  console.log(datas.join('\r\n'));
                        }
                    }
                },options);
                var filter = options.filter;
                var flushData = JSON.parse(infoStorage[infoStorageKey]);
                if(filter){
                    flushData = this._filter(filter);
                }
                options.output(flushData);
            },
            clear:function(){
                data = [];
                infoStorage[infoStorageKey] = '[]';
            },
            _filter:function(filter){
                var level = filter.level;
                var moduleName = filter.moduleName;
                var iteration = filter.fn || function(){return true;};
                var result = [];
                data.forEach(function(info){
                    if(level){
                        if(level.toUpperCase().indexOf(info.level.toUpperCase()) === -1){
                            return;
                        }
                    }
                    if(moduleName){
                        if(moduleName.toUpperCase().indexOf(info.moduleName.toUpperCase()) === -1){
                            return;
                        }
                    }
                    if(!iteration(info)){
                        return;
                    }
                    result.push(info);
                });
                return result;
            }
        },
        methods:{
            _formatInfo: function(arr, level) {
                arr = Array.prototype.slice.call(arr);
                var result = {};
                for (var key in keysToPrint) {
                    result[key] = keysToPrint[key];
                }
                result.moduleName = this._moduleName;
                result.date = new Date().getTime();
                result.message = arr;
                result.tpl = this._tmpl;
                result.level = level;
                return result;
            },
            log:function(str){
                var infos = this._formatInfo(arguments,'LOG');
                this._writeLog(infos);
                if(this._check()){
                    this._output.log(infos);
                }
            },
            debug:function(str){
                var infos = this._formatInfo(arguments,'DEBUG');
                this._writeLog(infos);
                if(this._check()){
                    this._output.debug(infos);
                }
            },
            info:function(str){
                var infos = this._formatInfo(arguments,'INFO');
                this._writeLog(infos);
                if(this._check()){
                    this._output.info(infos);
                }
            },
            warn:function(str){
                var infos = this._formatInfo(arguments,'WARN');
                this._writeLog(infos);
                if(this._check()){
                    this._output.warn(infos);
                }
            },
            error:function(str){
                var infos = this._formatInfo(arguments,'ERROR');
                this._writeLog(infos);
                if(this._check()){
                    this._output.error(infos);
                }
            },
            _writeLog:function(logObj){
                if(logObj && modulesToSave[logObj.moduleName]){
                    if(data.length >= max){
                        data.splice(0,1);
                    }
                    data.push(logObj);
                    this._save();
                }
            },
            _save:function(){
                infoStorage[infoStorageKey] = JSON.stringify(data);
            },
            _check:function(){
                return enabled;
            }
        }
    });

    module["__29"] = InfoCenter;
})(_qc);
(function (module){
    var _jsonToQuery = module["__20"];
    var InfoCenter = module["__29"];
    var ic = new InfoCenter({
        moduleName: 'ajax'
    });
    var ajax = {
        request:function(url,options){
            options = options || {};
            var data = options.data || "",
                async = (options.async !== false),
                username = options.username || "",
                password = options.password || "",
                method = (options.method || "GET").toUpperCase(),
                headers = options.headers || {},
                timeout = options.timeout || 0,
                eventHandlers = {},
                tick, key, xhr;
            var withCredentials = options.withCredentials || false;
            function stateChangeHandler() {
                if (xhr.readyState == 4) {
                    var stat;
                    try {
                        stat = xhr.status;
                    } catch (ex) {
                        ic.error(ex);
                        fire('failure');
                        return;
                    }
                    fire(stat);
                    //status == 0表示本地响应成功
                    if ((stat >= 200 && stat < 300)
                        || stat == 304
                        || stat == 1223 || stat === 0) {
                        if (stat === 0) {
                            try{
                                ic.error(url + ' 本地响应成功, resp: ' + xhr.responseText +
                                    ', withCredentials: ' + xhr.withCredentials);
                            }
                            catch(e){}
                        }
                        fire('success');
                    } else {
                        ic.error(stat);
                        fire('failure');
                    }
                    window.setTimeout(
                        function() {
                            if (xhr) {
                                xhr.onreadystatechange = function(){};
                            }
                            // xhr && (xhr.onreadystatechange = function(){});
                            if (async) {
                                xhr = null;
                            }
                        }, 0);
                }
            }
            function getXHR() {
                if (window.XMLHttpRequest) {
                    return new XMLHttpRequest();
                }
                if (window.ActiveXObject) {
                    try {
                        return new window.ActiveXObject("Msxml2.XMLHTTP");
                    } catch (e) {
                        try {
                            return new window.ActiveXObject("Microsoft.XMLHTTP");
                        } catch (e1) {}
                    }
                }
            }
            function fire(type) {
                type = 'on' + type;
                var handler = eventHandlers[type];
                if (handler) {
                    if (tick) {
                        window.clearTimeout(tick);
                    }

                    if (type !== 'onsuccess') {
                        handler(xhr);
                    } else {
                        var resp;
                        try {
                            resp = xhr.responseText;
                        } catch(error) {
                            ic.error(error);
                            return handler(xhr);
                        }
                        handler(xhr, xhr.responseText);
                    }
                    return true;
                }
                else{
                    return false;
                }
            }
            for (key in options) {
                eventHandlers[key] = options[key];
            }
            try {
                xhr = getXHR();
                if(Object.prototype.toString.call(data) == "[object Object]"){
                    data = _jsonToQuery(data);
                }
                if (method == 'GET') {
                    if (data) {
                        url += (url.indexOf('?') >= 0 ? '&' : '?') + data;
                        data = null;
                    }
                    if (options['noCache']) {
                        url += (url.indexOf('?') >= 0 ? '&' : '?') + 'b' + (+new Date()) + '=1';
                    }
                }

                if (username) {
                    xhr.open(method, url, async, username, password);
                } else {
                    xhr.open(method, url, async);
                }

                if (async) {
                    xhr.onreadystatechange = stateChangeHandler;
                }
                if (method == 'POST') {
                    xhr.setRequestHeader("Content-Type",
                        (headers['Content-Type'] || "application/x-www-form-urlencoded"));
                }

                for (key in headers) {
                    if (headers.hasOwnProperty(key)) {
                        xhr.setRequestHeader(key, headers[key]);
                    }
                }

                if('withCredentials' in xhr){
                    xhr.withCredentials = withCredentials;
                }

                fire('beforerequest');

                if (timeout) {
                    tick = setTimeout(function() {
                        if(!xhr){
                            return;
                        }
                        xhr.onreadystatechange = function() {};
                        ic.error(url + ' timeout');
                        xhr.abort();
                        if (!fire('timeout')) {
                            // fire('timeout')如果返回false，说明没有ontimeoutHandler，那么则触发failure事件
                            fire("failure");
                        }
                    }, timeout);
                }
                xhr.send(data);

                if (!async) {
                    stateChangeHandler();
                }
            } catch (ex) {
                ic.error(ex);
                fire('failure');
            }
            return xhr;
        }
    };

    module["__28"] = ajax;
})(_qc);
(function ( module) {
    var isSameDomain = module["__12"];
    var swfp = module["__14"];
    var ajax = module["__28"];
    var _ua = module["__19"];
    var request = function(url, options) {
            if (isSameDomain(url, document.location.href)) {
                return ajax.request(url, options);
            } else {
                if (_ua.IE6 || _ua.IE7 || _ua.IE8 || _ua.IE9) {
                    return swfp.request(url, options);
                } else {
                    if(options.withCredentials !== false){
                        options.withCredentials = true;
                    }
                    return ajax.request(url, options);
                }
            }
        };
    module["__11"] = request;
})(_qc);
(function (module){
    
    var req = module["__11"];
    
    module["__10"] = req;
})(_qc);
(function (module){
    
    var req = module["__10"];
    
    module["__9"] = function(url,options){
        if(options){
            var onsuccess = options.onsuccess;
            options.onsuccess = function(xhr,data){
                var data = data.trim();
                var obj = null;
                data = data.replace(/^[^\[\{]*([\[\{].*[\]\}]).*?$/,'$1');
                try{
                    obj = JSON.parse(data);
                }
                catch(e){}
                if(!obj){
                    try{
                        obj = (new Function("return (" + data + ")"))();
                    }
                    catch(e){}
                }
                if(onsuccess){
                    onsuccess(xhr,obj);
                }
            }
        }
        req(url,options);
    };
})(_qc);
(function ( module) {

    var _class = module["__3"];
    var _extend = module["__8"];
    var _json2 = module["__9"];

    module["__7"] = _class('RIVcop',
        {
            construct:function (opt) {
                opt = opt || {};
                if(opt.action && opt.url){
                    switch (opt.action) {
                        case "baidu":
                            this.url =opt.url+ 'api/baidu/authorize';
                            break;
                        case "ent":
                            this.url =opt.url+ 'api/enterprise/authorize';
                            break;
                        case "person":
                            this.url =opt.url+ 'api/person/authorize';
                            break;
                        case "del":
                            this.url = opt.url+'api/file/delete';
                            break;
                        case "count":
                            this.url =opt.url+ 'api/file/count';
                            break;
                        case "info":
                            this.url =opt.url+ 'api/file/fetchvideolist';
                            break;
                        case "page":
                            this.url =opt.url+ 'api/file/fetchvideolist';
                            break;
                        case "infoExternal":
                            this.url =opt.url+ 'api/file/videoListForExternal';
                            break;
                        case "pageExternal":
                            this.url =opt.url+ 'api/file/videoListForExternal';
                            break;
                        case "meta":
                            this.url = opt.url+'api/file/info';
                            break;
                        case "refresh":
                            this.url = opt.url+'api/oauth2/token';
                            break;
                        case "fullStatus":
                            this.url = opt.url+'api/file/fullStatus';
                            break;
                        case "getDownloadUri":
                        	this.url = opt.url+'api/download/getDownloadUri';
                        	break;
                    }
                }
            },
            methods:{
                request:function (param, callback) {
                    var _this=this;
                    param = param || {};
                    var _opt = {};
                    _opt.data = {
                        cb:"vocp" + new Date().getTime()
                    };
                    _extend(_opt.data, param);
                    _opt.onsuccess = function (xhr, data) {
                        if(!data){
                            data=_this._forError();
                        }
                        if (callback){
                            callback(data);
                        }
                    };
                    _opt.onfailure = function (xhr, data) {
                        if(!data){
                            data=_this._forError();
                        }
                        if (callback){
                            callback(data);
                        }
                    };
                    _opt.withCredentials = false;
                    _json2(this.url, _opt);
                },
                _forError:function(){
                    var data={};
                    data.code=data.code || 'E00000';
                    data.msg=data.msg || '请求错误';
                    return data;
                }
            }
        });
})(_qc);
(function ( module) {

    var _class = module["__3"];
    var Interface = module["__7"];

    module["__6"]=_class('VcopManager', {
        construct:function (opt) {
            this._opt = opt || {};
            this.url = opt.url;
        },
        properties:{
            _version:"2.1.1",
            url:""
        },
        methods:{
            getAuthBaidu:function(opt,callback){    // 获取百度授权
                var ri = new Interface({url:this.url,action:'baidu'});
                return ri.request(opt,callback);
            },
            getAuthPerson:function(opt,callback){    // 获取个人授权
                var ri = new Interface({url:this.url,action:'person'});
                return ri.request(opt,callback);
            },
            getAuthEnterprise:function(opt,callback){   // 企业级授权
                var ri = new Interface({url:this.url,action:'ent'});
                return ri.request(opt,callback);
            },
            refreshToken:function(opt,callback){    // 刷新token
                var ri = new Interface({url:this.url,action:'refresh'});
                return ri.request(opt,callback);
            },
            setMetadata:function (opt,callback) {  // 设置视频信息
                var ri = new Interface({url:this.url,action:'meta'});
                return ri.request(opt,callback);
            },
            delVideoById:function (opt,callback) {  // 删除视频
                var ri = new Interface({url:this.url,action:'del'});
                return ri.request(opt,callback);
            },
            getVideoListPage:function (opt,callback) {  // 获取视频列表
                var ri = new Interface({url:this.url,action:'page'});
                return ri.request(opt,callback);
            },
            getVideoInfo:function (opt,callback) {  // 获取指定视频信息，多个用,分开
                var ri = new Interface({url:this.url,action:'info'});
                opt = opt || {};
                return ri.request(opt,callback);
            },
            getVideoListPageExternal:function (opt,callback) {  // 获取视频列表
                var ri = new Interface({url:this.url,action:'pageExternal'});
                return ri.request(opt,callback);
            },
            getVideoInfoExternal:function (opt,callback) {  // 获取指定视频信息，多个用,分开
                var ri = new Interface({url:this.url,action:'infoExternal'});
                opt = opt || {};
                return ri.request(opt,callback);
            },
            getVideoCount:function (opt,callback) {  // 获取视频的总量
                var ri = new Interface({url:this.url,action:'count'});
                return ri.request(opt,callback);
            },
            getFileStatus:function(opt,callback){
                var ri = new Interface({url:this.url,action:'fullStatus'});
                return ri.request(opt,callback);
            },
            getDownloadUri:function(opt,callback){
            	var ri = new Interface({url:this.url,action:'getDownloadUri'});
            	return ri.request(opt,callback);
            },
            getSDKVersion:function () {  // 获取版本号
                return this._version;
            }
        }
    });
})(_qc);
(function ( module) {
    var _ua = module["__19"];
    var _json2 = module["__9"];
    var _clear = module["__16"];
    var __callbacks__ = module["__15"];
    var _class = module["__3"];
    var ns = 'window.Q.__callbacks__.';

    module["__35"] = _class('Upload', {
        construct:function () {
            this.init();
        },
        properties:{
            slicesize:524288, //分片上传时每片文件的大小为512K
            concurrenttaskallowed:2, // 上传线程,
            startTime:0, // 开始时间
            erroroCount:0, //出错数，>5则退出
            timeoutCount:0   // 超时次数
        },
        methods:{
            init:function () {
                this.tasklist = [];                  // 分片任务队列
                this.totaltaskcount = 0;           // 总片数
                this.concurrenttaskcount = 0;    // 当前进行的任务数
                this.finishedtaskcount = 0;      // 已完成片数
                this.isGo = true;                  // 是否继续上传
                this.timer = null;
                this.startTime = 0;                 // 开始上传时间
                this.erroroCount = 0;               // 失败次数
                this.timeoutCount = 0;
                this.currenttaskarr = null;
            },
            nexttask:function (handler) {     // 执行一个上传任务
                this.startTime = new Date().getTime();
                while (this.tasklist.length > 0) {
                    if (this.concurrenttaskcount < this.concurrenttaskallowed) {
                        this.currenttaskarr = this.tasklist.shift();
                        this.concurrenttaskcount++;
                        this.uploadFileBuf(
                            this.currenttaskarr[0], //  chunkbuf
                            this.currenttaskarr[1], //  resourceid
                            this.currenttaskarr[2], //  range
                            this.currenttaskarr[3], //  filesize
                            this.currenttaskarr[4], //  apiurl
                            this.currenttaskarr[5], // realend
                            handler
                        );
                    } else {
                        break;
                    }
                }
            },
            uploadFileBuf:function (filebuf, resourceid, range, wholefilesize, apiurl, uploadend, handler) {   //上传一片文件
                //异步传输
                var _this = this;
                var param = {
                    headers:{
                        file_id:resourceid,
                        range:range,
                        file_size:wholefilesize
                    },
                    method:"POST",
                    timeout:5000,
                    data:filebuf,
                    on200:function () {
                        _this.concurrenttaskcount--;
                        _this.finishedtaskcount++;
                        _this.drawProgress(_this.finishedtaskcount / _this.totaltaskcount, resourceid, handler);
                        if (_this.finishedtaskcount == _this.totaltaskcount) {
                            //全部传完
                            _this.totoaltaskcount = 0;
                            _this.finishedtaskcount = 0;
                        }
                    },
                    onsuccess:function () {
                        _this.erroroCount = 0;
                        if (_this.isGo) {
                            _this.nexttask(handler);
                        }
                    },
                    onfailure:function (d) {
                        _this.erroroCount += 1;
                        if (_this.erroroCount <= 5) {
                            _this.uploadFileBuf(filebuf, resourceid, range, wholefilesize, apiurl, uploadend, handler);
                        }
                        else {
                            var txt = d.responseText ? d.responseText.trim() : '';
                            var obj = null;
                            txt = txt.replace(/^[^\[\{]*([\[\{].*[\]\}]).*?$/, '$1');
                            try {
                                obj = JSON.parse(txt);
                            }
                            catch (e) {
                            }
                            if (!obj) {
                                obj = {
                                    msg:'server error',
                                    code:'E00000'
                                }
                            }
                            handler.onError && handler.onError(obj);
                        }
                    },
                    ontimeout:function (d) {
                        _this.uploadFileBuf(filebuf, resourceid, range, wholefilesize, apiurl, uploadend, handler);
                    }
                };
                param.withCredentials = false;
                _json2(apiurl, param);
            },
            drawProgress:function (progress, resourceid, handler) {         // 执行过程
                var percent = Math.floor(progress * 100);
                var remain = (this.totaltaskcount - this.finishedtaskcount) * (this.slicesize / 1024);  // 剩余
                var speed = (this.slicesize / 1024) / ((new Date().getTime() - this.startTime) / 1000);           // 1kb/s
                handler.onProgress && handler.onProgress({
                    file_id:resourceid,
                    percent:percent,
                    speed:speed,
                    remainTime:remain / speed,
                    finished:this.finishedtaskcount * (this.slicesize / 1024),
                    total:this.totaltaskcount * (this.slicesize / 1024)});
                if (percent == 100) {
                    handler.onFinish && handler.onFinish({manualFinish:true, file_id:resourceid});
                }
            },
            drawProgressFlash:function (loaded, total, handler) {
                var progress = loaded / total;
                var remain = total - loaded;
                var percent = Math.floor(progress * 100);
                var speed = loaded / ((new Date().getTime() - this.startTime) / 1000);
                handler.onProgress && handler.onProgress({
                    percent:percent,
                    speed:speed,
                    remainTime:remain / speed,
                    finished:loaded, total:total});
                if (percent == 100) {
                    if (this.timer) {
                        clearInterval(this.timer);
                        this.timer = null;
                    }
                    handler.onFinish && handler.onFinish({manualFinish:false});
                }
            },
            breakResume:function (thefile, resourceid, apiurl, handler,fs) {
                this._doStartUpload(thefile, resourceid, apiurl, handler,fs);
            },
            uploadBySlice:function (thefile, resourceid, apiurl, handler) {        // 分片上传
                this._doStartUpload(thefile, resourceid, apiurl, handler);
            },
            _doStartUpload:function(thefile, resourceid, apiurl, handler,fs){
                this.init();
                handler = handler || {};
                var file = thefile;
                var filesize = thefile.size;
                var start =fs|| 0;
                var end =fs?fs+this.slicesize:this.slicesize;
                var chunkbuf = null;
                while (start < filesize) {
                    var realend = end;
                    var binaryend = end;
                    if (realend >= filesize) {
                        realend = filesize - 1;
                        binaryend = filesize;

                    }
                    if (file.slice) {
                        chunkbuf = file.slice(start, binaryend);
                    } else if (file.mozSlice) {
                        chunkbuf = file.mozSlice(start, binaryend);
                    } else if (file.webkitSlice) {
                        chunkbuf = file.webkitSlice(start, binaryend);
                    }
                    var range = '' + start + '-' + realend;
                    //构造一个任务
                    var mycars = [];
                    mycars[0] = chunkbuf;
                    mycars[1] = resourceid;
                    mycars[2] = range;
                    mycars[3] = filesize;
                    mycars[4] = apiurl;
                    mycars[5] = realend;
                    this.tasklist.push(mycars);
                    start = end;
                    end = start + this.slicesize;
                }
                //开始上传任务
                this.totaltaskcount = this.tasklist.length;
                this.nexttask(handler);
            },
            start:function (opt) {
                var _this = this;
                if (_ua.IE6 || _ua.IE7 || _ua.IE8 || _ua.IE9) {
                    _clear.on('ready', function () {
                        var callbackNameValue = 'iqiyi__upload__' + Math.floor(Math.random() * 2147483648).toString(36);
                        opt = opt || {};
                        var callname = callbackNameValue + "__" + opt.type;

                        switch (opt.type) {
                            case "request":
                                __callbacks__[callname] = function (data) {
                                    var _data = JSON.parse(data);
                                    if (_data.code == 'A00001') {
                                        opt.handler && opt.handler.onError(_data);
                                    }
                                    else {
                                        opt.handler && opt.handler.onSuccess(_data);
                                    }
                                    //delete __callbacks__[callname];
                                };
                                _clear.notice({
                                    type:'request',
                                    data:{
                                        url:opt.url,
                                        param:opt.param,
                                        callback:ns + callname
                                    }
                                });
                                break;
                            case "upload":
                                if (_this.timer) {
                                    clearInterval(_this.timer);
                                    _this.timer = null;
                                }
                                _this.startTime = new Date().getTime();
                                _this.timer = setInterval(function () {
                                    var info = _clear.get().notice(
                                        JSON.stringify({type:'progress',
                                            data:{
                                                param:{
                                                    file_id:opt.file_id
                                                }
                                            }
                                        }));
                                    if (info) {
                                        var _temp = JSON.parse(info);
                                        _this.drawProgressFlash(_temp.data.byteLoaded / 1024, _temp.data.byteTotal / 1024, opt.handler);
                                    }
                                }, 100);
                                __callbacks__[callname] = function (data) {
                                    var _data = JSON.parse(data);
                                    if (_data.code == 'A00001') {
                                        opt.handler.onError() && opt.handler.onError(_data);
                                    }
                                    else {
                                        opt.handler.onFinish && opt.handler.onFinish(_data);
                                    }
                                    delete __callbacks__[callname];
                                };
                                _clear.notice({
                                    type:'upload',
                                    data:{
                                        url:opt.upload_url,
                                        param:{
                                            file_id:opt.file_id
                                        },
                                        callback:ns + callname
                                    }
                                });
                                break;
                            case "cancel":
                                __callbacks__[callname] = function (data) {
                                    var _data = JSON.parse(data);
                                    if (_data.code == 'A00001') {
                                        opt.handler.onError() && opt.handler.onError(_data);
                                    }
                                    else {
                                        opt.handler.onSuccess() && opt.handler.onSuccess(_data);
                                        if (_this.timer) {
                                            clearInterval(_this.timer);
                                            _this.timer = null;
                                        }
                                    }
                                    delete __callbacks__[callname];
                                };
                                _clear.notice({
                                    type:'cancel',
                                    data:{
                                        url:opt.url,
                                        param:{
                                            file_id:opt.file_id,
                                            status:2
                                        },
                                        callback:ns + callname
                                    }
                                });
                                break;
                        }
                    });
                }
                else {
                    switch (opt.type) {
                        case "upload":
                            this.uploadBySlice(opt.thefile, opt.file_id, opt.upload_url, opt.handler);
                            break;
                        case "pause":
                            this.timeoutCount = 0;
                            this.isGo = false;
                            if (opt.handler) {
                                opt.handler({
                                    precent:this.finishedtaskcount / this.totaltaskcount,
                                    file_id:this.currenttaskarr[1],
                                    range:this.currenttaskarr[2],
                                    filesize:this.currenttaskarr[3],
                                    apiurl:this.currenttaskarr[4],
                                    realend:this.currenttaskarr[5],
                                    breakpoint:this.finishedtaskcount
                                });
                            }
                            break;
                        case "resume":
                            this.concurrenttaskcount = 0;
                            this.isGo = true;
                            this.nexttask(opt.handler);
                            break;
                        case "breakResume":
                            this.concurrenttaskcount = 0;
                            this.isGo = true;
                            this.breakResume(opt.thefile, opt.file_id, opt.upload_url, opt.handler,opt.forstart);
                            break;
                    }
                }
            }
        }
    });
})(_qc);
(function ( module) {

    var _class = module["__3"];
    var _json2 = module["__9"];
    var _parse = module["__13"];
    var Upload = module["__35"];
    module["__34"] = _class('RIVcopUploadVideo',
        {
            construct:function (opt) {
                opt = opt || {};
                this.handler = opt.handler;
                this.url = opt.url;
                if (opt.type == "meizi") {
                    this.requestUrl = this.url + "msupload";
                } else {
                    this.requestUrl = this.url + "openupload";
                }

                this.finishUrl = "/upload";
                this.cancelUrl = "/cancelupload";
                this._upload = new Upload();
            },
            methods:{
                requestFileFlash:function (opt) {
                    this._upload.start({
                        type:"request",
                        handler:this.handler,
                        url:this.requestUrl,
                        param:opt.param
                    });
                },
                requestFile:function (param) {
                    param = param || {};
                    var _this = this;
                    param.onsuccess = function (opt, data) {
                        if (data && data.code == "A00000") {
                            data.data.file_size=param.headers.filesize;
                            if (param.onSuccess){
                                param.onSuccess(data);
                            }
                            else if (_this.handler && _this.handler.onSuccess){
                                _this.handler.onSuccess(data);
                            }
                        }
                        else {
                            data=_this._forError(data);
                            if (param.onError){
                                param.onError(data);
                            }
                            else if(_this.handler && _this.handler.onError){
                                _this.handler.onError(data);
                            }
                        }
                    };
                    param.onfailure = function (opt, data) {
                        data=_this._forError(data,opt);
                        if (param.onError){
                            param.onError(data);
                        }
                        else if(_this.handler && _this.handler.onError){
                            _this.handler.onError(data);
                        }
                    };
                    param.withCredentials = false;
                    _json2(this.requestUrl, param);
                },
                finishUpload:function (param) {
                    param = param || {};
                    var _this = this;
                    param.method = "post";
                    param.headers.range_finished = true;
                    param.onsuccess = function (opt, data) {
                        if (data && data.code == "A00000") {
                            if (param.handler && param.handler.onSuccess){
                                param.handler.onSuccess(data);
                            }
                            else{
                                _this.handler.onSuccess && _this.handler.onSuccess(data);
                            }
                        }
                        else {
                            data=_this._forError(data);
                            if (param.handler && param.handler.onError){
                                param.handler.onError(data);
                            }
                            else{
                                _this.handler.onError && _this.handler.onError(data);
                            }
                        }
                    };
                    param.onfailure = function (opt, data) {
                        data=_this._forError(data,opt);
                        if (param.handler && param.handler.onError){
                            param.handler.onError(data);
                        }
                        else{
                            _this.handler.onError && _this.handler.onError(data);
                        }
                    };
                    param.withCredentials = false;
                    _json2(this.upload_url_host + this.finishUrl, param);
                },
                uploadFile:function (param) {
                    param.type = param.type || "upload";
                    if (param.upload_url) {
                        this.upload_url_host = _parse(param.upload_url).protocol + "://" + _parse(param.upload_url).host;
                    }
                    this._upload.start(param);
                },
                uploadFileFlash:function (param) {
                    param.type = param.type || "upload";
                    this.upload_url_host = _parse(param.upload_url).protocol + "://" + _parse(param.upload_url).host;
                    this._upload.start(param);
                },
                cancelUpload:function (param) {
                    param = param || {};
                    var _this = this;
                    this._upload.start({type:"pause"});
                    param.onsuccess = function (opt, data) {
                        if (data && data.code == "A00000") {
                            if (param.handler && param.handler.onSuccess){
                                param.handler.onSuccess(data);
                            }
                            else{
                                _this.handler.onSuccess && _this.handler.onSuccess(data);
                            }
                        }
                        else {
                            data=_this._forError(data);
                            if (param.handler.onError){
                                param.handler.onError(data);
                            }
                            else {
                                _this.handler.onError && _this.handler.onError(data);
                            }
                        }
                    };
                    param.onfailure = function (opt, data) {
                        data=_this._forError(data,opt);
                        if (param.handler && param.handler.onError){
                            param.handler.onError(data);
                        }
                        else {
                            _this.handler.onError && _this.handler.onError(data);
                        }
                    };
                    param.withCredentials = false;
                    _json2(this.upload_url_host + this.cancelUrl, param);
                },
                cancelUploadFlash:function () {
                    this._upload.start({
                        type:"cancel",
                        handler:this.handler,
                        url:this.cancelUrl
                    });
                },
                _forError:function(data,opt){
                    data=data||{};
                    if(opt){
                        var txt = opt.responseText?opt.responseText.trim():'';
                        txt = txt.replace(/^[^\[\{]*([\[\{].*[\]\}]).*?$/,'$1');
                        try{
                            data = JSON.parse(txt);
                        }
                        catch(e){}
                        if(!data){
                            data={
                                msg:'server error',
                                code:'E00000'
                            }
                        }
                    }
                    data.code=data.code || 'E00000';
                    data.msg=data.msg || '请求错误';
                    return data;
                }
            }
        });
})(_qc);
(function ( module) {

    var _class = module["__3"];
    var RIUpload=module["__34"];
    var _ua = module["__19"];
    var _clear = module["__16"];

    module["__33"] =_class('vcopUploader',{
        construct:function (opt) {
            opt = opt || {};
            this.type=opt.type||"openapi";
            this.url = opt.url;
            this._opt=opt;
            this.uploader=new RIUpload(opt);
            this.file_id="";
            this.handler=opt.handler||{};
        },
        properties:{
            url:"",
            allowFileTypes:["mpg", "mpeg", "mp4", "m4v", "flv", "f4v", "mkv", "avi", "rm", "rmvb", "wmv", "mov", "ts", "vob"]
        },
        methods:{
            initFile:function(opt,handler){
                opt=opt||{};
                this.uploader.handler = handler;
                opt.handler = handler;
                this.uploader.requestFile(opt);
            },
            initOneFile:function (opt) {   // 上传文件
                // 请求上传
                this.uploader.handler=this.handler;
                if (this._cannotHtml5()) {  // 监听flash request
                    this.uploader.requestFileFlash({
                        param:{
                            access_token:this._opt.access_token,
                            device_id:this._opt.device_id || 'qipa',
                            role:"openapi",
                            btnH:opt.btnH,
                            btnW:opt.btnW
                        }
                    });
                    var swf = _clear.get();
                    if (swf) {
                        swf.style.width = opt.btnW || "62px";
                        swf.style.height =opt.btnH ||  "32px";
                        swf.style.top=opt.btnT;
                        swf.style.left=opt.btnL;
                        if(opt.btnZ){
                            swf.style.zIndex=opt.btnZ;
                        }
                    }
                }
                else {
                    var file = document.getElementById('qiyifileupload');
                    if (!file.files || file.files.length == 0){
                        return;
                    }
                    this.uploader.currentFile = file.files[0];
                    var filetype = this.getFileType(this.uploader.currentFile.name);
                    if (this.allowFileTypes.indexOf(filetype) == -1) {
                        this.uploader.handler.onError && this.uploader.handler.onError({
                            msg:"文件类型错误"
                        })
                    }
                    else {
                        this.uploader.requestFile({headers:{
                            access_token:this._opt.access_token,
                            device_id:this._opt.device_id || 'openapi',
                            role:"openapi",
                            filesize:"" + this.uploader.currentFile.size,
                            filetype:filetype}
                        });
                    }
                }
            },
            startUpload:function (opt, handler) {
                // 开始上传
                opt = opt || {};
                if (this.uploader) {
                    this.uploader.handler = handler;
                    opt.handler = handler;
                    if(!this.hasMeta){     // 是否设置过meta
                        handler.onError({
                            code:"E00000",
                            msg:"Please set meta first"
                        });
                        return;
                    }
                    this.file_id = opt.file_id;
                    if (!this._cannotHtml5()) {
                        opt.thefile = this.uploader.currentFile;
                        this.uploader.uploadFile(opt);
                    }
                    else {
                        this.uploader.uploadFileFlash(opt);
                    }
                }
            },
            getFileType:function (fileName) {
                if (fileName != null) {
                    var pos = fileName.lastIndexOf(".") + 1;
                    var lastname = fileName.substring(pos);
                    return lastname.toLowerCase();
                }
                return "";
            },
            pauseUpload:function (callback) {  // 停止上传
                if (!this._cannotHtml5() && this.uploader) {
                    this.uploader.uploadFile({
                        type:"pause",
                        handler:callback}
                    );
                }
            },
            resumeUpload:function (handler) {  // 恢复上传
                if (!this._cannotHtml5() && this.uploader) {
                    this.uploader.uploadFile({
                        type:"resume",
                        handler:handler});
                }
            },
            cancelUpload:function (handler) {  // 取消上传
                // 取消上传
                if (this.uploader) {
                    if (this._cannotHtml5()) {
                        // 监听flash cancel
                        this.uploader.cancelUploadFlash(handler)
                    }
                    else {
                        this.uploader.cancelUpload({
                            headers:{
                                access_token:this._opt.access_token,
                                file_id:this.file_id,
                                status:2
                            },
                            handler:handler});
                    }
                }
            },
            finishUpload:function (handler) {     // 上传结束
                this.uploader.finishUpload({
                    headers:{
                        access_token:this._opt.access_token,
                        file_id:this.file_id
                    },
                    handler:handler});
            },
            breakResume:function(opt){
                if (!this._cannotHtml5() && this.uploader) {
                    opt=opt || {};
                    opt.type='breakResume';
                    this.uploader.uploadFile(opt);
                }
            },
            _cannotHtml5:function () {
                return (_ua.IE6 || _ua.IE7 || _ua.IE8 || _ua.IE9);
            }
        }
    });

})(_qc);
(function ( module) {

    var vcop = null;
    var _class = module["__3"];
    var Manager = module["__6"];
    var Uploader = module["__33"];
    var _ua = module["__19"];
    var Vcop = _class('vcopClinet', {
        construct:function (opt) {
            this._opt = opt || {};
            this._opt.redirectUrl = opt.redirectUrl || window.location.href;
            this._opt.appKey = opt.appKey || '';
            this._opt.appSecret = opt.appSecret || '';
            this._opt.managerUrl = opt.managerUrl || 'https://openapi.iqiyi.com/';   // openapi server
            this._opt.uploadUrl = opt.uploadUrl || 'http://qichuan.iqiyi.com/';               // qichuan server
            this.multi=opt.multi || false;
            this._opt.uploadBtn=opt.uploadBtn || {dom:null,btnH:"1px",btnW:"1px",btnT:"0px",btnL:"0px",hasBind:false};  // 覆盖区  {dom,btnH,btnW,btnT,btnL}
            this._opt.uploadBtn.hasBind = this._opt.uploadBtn.hasBind || false;
            this._opt.needMeta=opt.needMeta === false?false:true;
            this.init();
        },
        properties:{
            authtoken:"",
            manager:null,
            multi:false,
            onlyFile:null,
            allowFileTypes:["video/*"]
        },
        methods:{
            getProperties:function () {
                return this._opt;
            },
            init:function () {
                this.manager = new Manager({url:this._opt.managerUrl});
                if(!this.multi){
                    this._preparePage();
                }
            },
            _preparePage:function () {
                // 初始化页面
                if (!document.getElementById('qiyidivfile')) {
                    var div = document.createElement('div');
                    div.id = "qiyidivfile"
                    div.style.display = 'none';
                    div.innerHTML = '<input id="qiyifileupload" type="file" />';
                    document.body.insertBefore(div, null);
                    this._buildEvent();
                    this._buildFileEvent();
                }
            },
            _buildEvent:function(){
                var _this = this;
                var file=null;
                if (this._opt.uploadBtn && this._opt.uploadBtn.dom && !this._opt.uploadBtn.hasBind) {
                    if (_this._cannotHtml5())
                        this._opt.uploadBtn.dom.attachEvent('onclick', function () {
                            if (_this.authtoken && _this.onlyFile)
                               _this.onlyFile.initOneFile({
                                   btnH:_this._opt.uploadBtn.btnH,
                                   btnW:_this._opt.uploadBtn.btnW,
                                   uploadBtn:_this._opt.uploadBtn.dom,
                                   btnT:_this._opt.uploadBtn.btnT,
                                   btnL:_this._opt.uploadBtn.btnL,
                                   btnZ:_this._opt.uploadBtn.btnZ
                               });
                        });
                    else {
                        file= document.getElementById('qiyifileupload');
                        this._clearFiles(file);
                        this._opt.uploadBtn.dom.addEventListener('click', function () {
                            if (_this.authtoken)
                                file.click();
                        }, false);
                    }
                    this._opt.uploadBtn.hasBind=true;
                }
                else{
                    file= document.getElementById('qiyifileupload');
                    this._clearFiles(file);
                }
            },
            _buildFileEvent:function(){
                if(this._cannotHtml5())
                    return;
                var _this=this;
                var file= document.getElementById('qiyifileupload');
                this._clearFiles(file);
                file.accept=this.allowFileTypes.join(',');
                file.addEventListener('change', function () {
                    _this.onlyFile && _this.onlyFile.initOneFile();
                }, false);
            },
            _clearFiles:function(file){
                file = file ||  document.getElementById('qiyifileupload');
                if(file.files && file.files.length>0){
                    file.files=null;
                    file.value='';
                }
            },
            _cannotHtml5:function () {
                return (_ua.IE6 || _ua.IE7 || _ua.IE8 || _ua.IE9);
            },
            resetApiUrl:function (url) {
                this._opt.managerUrl=url;
                if (this.manager) {
                    this.manager.url = url;
                }
            },
            getAuthNormal:function () {    // 普通获取授权
                var url = this._opt.managerUrl+'api/oauth2/authorize?client_id=' + this._opt.appKey + '&response_type=token&redirect_uri=' + this._opt.redirectUrl;
                var _window = window.open(url, 'newwindow', 'height=' + 500 + ',width=' + 600 + ',toolbar=no,menubar=no,scrollbars=no, resizable=no,location=yes, status=no');
                if (!_window) {
                    alert("请允许弹窗验证窗体");
                }
            },
            getAuthBaidu:function (opt, callback) {    // baidu获取授权
                opt = opt || {};
                opt.client_id = opt.client_id || this._opt.appKey;
                this.manager.getAuthBaidu(opt, callback);
            },
            getAuthPerson:function (opt, callback) {    // 个人获取授权
                opt = opt || {};
                opt.client_id = this._opt.appKey;
                opt.client_secret = this._opt.appSecret;
                this.manager.getAuthPerson(opt, callback);
            },
            getAuthEnterprise:function (callback) {    // 企业级获取授权
                var opt={};
                opt.client_id = this._opt.appKey;
                opt.client_secret = this._opt.appSecret;
                this.manager.getAuthEnterprise(opt, callback);
            },
            refreshToken:function(opt,callback){    // 刷新token
                opt = opt || {};
                opt.client_id = this._opt.appKey;
                opt.client_secret = this._opt.appSecret;
                this.manager.refreshToken(opt, callback);
            },
            initUpload:function(opt,handler){
                opt=opt|| {};
                this._clearFiles();
                opt.type=opt.type || "openapi";
                opt.url=this._opt.uploadUrl;
                opt.access_token=this.authtoken;
                opt.handler=handler;
                var uploader=new Uploader(opt);
                if(!this.multi){
                    this.onlyFile=uploader;
                }
                if(!this._opt.needMeta){
                    uploader.hasMeta=true;
                }
                return uploader;
            },
            setMetadata:function (opt, callback) {  // 设置视频信息
                opt = opt || {};
                opt.access_token = opt.access_token || this.authtoken;
                if(opt.uploader){
                    this.manager.setMetadata(opt, function(data){   // 20130819 需要手动设置meta
                        if(data.code==='A00000'){
                            opt.uploader.hasMeta=true;
                        }
                        callback(data);
                    });
                }
            },
            delVideoById:function (opt, callback) {  // 删除视频
                opt = opt || {};
                opt.access_token = opt.access_token || this.authtoken;
                opt.delete_type=1;
                this.manager.delVideoById(opt, callback);
            },
            getVideoListPage:function (opt, callback) {  // 获取视频列表
                opt = opt || {};
                opt.access_token = opt.access_token || this.authtoken;
                if(opt.internal){
                    this.manager.getVideoListPage(opt, callback);
                }
                else{
                    this.manager.getVideoListPageExternal(opt, callback);
                }
            },
            getVideoInfo:function (opt, callback) {  // 获取指定视频信息，多个用,分开
                opt = opt || {};
                opt.access_token = opt.access_token || this.authtoken;
                if(opt.internal){
                    this.manager.getVideoInfo(opt, callback);
                }
                else{
                    this.manager.getVideoInfoExternal(opt, callback);
                }
            },
            getVideoCount:function (opt, callback) {  // 获取视频的总量
                opt = opt || {};
                opt.access_token = opt.access_token || this.authtoken;
                this.manager.getVideoCount(opt, callback);
            },
            getFileStatus:function(opt,callback){       // 获取视频状态
                opt = opt || {};
                opt.access_token = opt.access_token || this.authtoken;
                this.manager.getFileStatus(opt, callback);
            },
            getSDKVersion:function () {  // 获取版本号
                return this.manager.getSDKVersion();
            },
            resetBtn:function(opt){
                if(opt && opt.uploadBtn){
                    if(opt.uploadBtn.dom===this._opt.uploadBtn.dom){
                        opt.uploadBtn.hasBind=true;
                    }
                    this._opt.uploadBtn=opt.uploadBtn;
                    this._buildEvent();
                }
            }
        }
    });

    module["__2"] = function (opt) {
        if (!vcop) {
            vcop = new Vcop(opt);
        }
        return vcop;
    }
})(_qc);
(function (module){
    var global = module["__1"];
    global.JSON = global.JSON || {};
    if(!global.JSON.stringify){
        global.JSON.stringify = 
            (function () {
                /**
                 * 字符串处理时需要转义的字符表
                 * @private
                 */
                var escapeMap = {
                    "\b": '\\b',
                    "\t": '\\t',
                    "\n": '\\n',
                    "\f": '\\f',
                    "\r": '\\r',
                    '"' : '\\"',
                    "\\": '\\\\'
                };
                
                /**
                 * 字符串序列化
                 * @private
                 */
                function encodeString(source) {
                    if (/["\\\x00-\x1f]/.test(source)) {
                        source = source.replace(
                            /["\\\x00-\x1f]/g, 
                            function (match) {
                                var c = escapeMap[match];
                                if (c) {
                                    return c;
                                }
                                c = match.charCodeAt();
                                return "\\u00" 
                                        + Math.floor(c / 16).toString(16) 
                                        + (c % 16).toString(16);
                            });
                    }
                    return '"' + source + '"';
                }
                
                /**
                 * 数组序列化
                 * @private
                 */
                function encodeArray(source) {
                    var result = ["["], 
                        l = source.length,
                        preComma, i, item;
                        
                    for (i = 0; i < l; i++) {
                        item = source[i];
                        
                        switch (typeof item) {
                        case "undefined":
                        case "function":
                        case "unknown":
                            break;
                        default:
                            if(preComma) {
                                result.push(',');
                            }
                            result.push(global.JSON.stringify(item));
                            preComma = 1;
                        }
                    }
                    result.push("]");
                    return result.join("");
                }
                
                /**
                 * 处理日期序列化时的补零
                 * @private
                 */
                function pad(source) {
                    return source < 10 ? '0' + source : source;
                }
                
                /**
                 * 日期序列化
                 * @private
                 */
                function encodeDate(source){
                    return '"' + source.getFullYear() + "-" 
                            + pad(source.getMonth() + 1) + "-" 
                            + pad(source.getDate()) + "T" 
                            + pad(source.getHours()) + ":" 
                            + pad(source.getMinutes()) + ":" 
                            + pad(source.getSeconds()) + '"';
                }
                
                return function (value) {
                    switch (typeof value) {
                    case 'undefined':
                        return 'undefined';
                        
                    case 'number':
                        return isFinite(value) ? String(value) : "null";
                        
                    case 'string':
                        return encodeString(value);
                        
                    case 'boolean':
                        return String(value);
                        
                    default:
                        if (value === null) {
                            return 'null';
                        } else if (value instanceof Array) {
                            return encodeArray(value);
                        } else if (value instanceof Date) {
                            return encodeDate(value);
                        } else {
                            var result = ['{'],
                                encode = global.JSON.stringify,
                                preComma,
                                item;
                                
                            for (var key in value) {
                                if (Object.prototype.hasOwnProperty.call(value, key)) {
                                    item = value[key];
                                    switch (typeof item) {
                                    case 'undefined':
                                    case 'unknown':
                                    case 'function':
                                        break;
                                    default:
                                        if (preComma) {
                                            result.push(',');
                                        }
                                        preComma = 1;
                                        result.push(encode(key) + ':' + encode(item));
                                    }
                                }
                            }
                            result.push('}');
                            return result.join('');
                        }
                    }
                };
            })();
    }
})(_qc);
(function ( module) {
    /**
     * ECMAScript 5 Reference: 15.4.4.14
     * According to specification Array.prototype.indexOf.length is 1
     * @param searchElement -
     * @param fromIndex {number} - start index (optional)
     * @returns {number} index of found element or -1
     * @example ['a','b','c'].indexOf('b') === 1;
     */
    if(!Array.prototype.indexOf) {
        Array.prototype.indexOf = function(searchElement) {
            var len = this.length,
                i = +arguments[1] || 0; // fromIndex
            if(len === 0 || isNaN(i) || i >= len) return -1;

            if(i < 0) {
                i = len + i;
                i < 0 && (i = 0);
            }

            for(; i < len; ++i) {
                if(this[i] === searchElement) return i;
            }

            return -1;
        };
    }
})(_qc);
(function (module){
    /**
     * Trims left and right side of the string. Method removes spaces, tabulators
     * and new line characters.
     * Method implements probably the fastest algorithm of JavaScript trim operation
     * (see http://blog.stevenlevithan.com/archives/faster-trim-javascript)
     * ECMAScript 5 Reference: 15.5.4.20
     * @returns {string} trimmed string
     */
    String.prototype.trim || (String.prototype.trim = function(){
        return this.replace(/^\s\s*/, '').replace(/\s\s*$/, '');
    });

})(_qc);
(function (module){
    var global = module["__1"];
    global.JSON = global.JSON || {};
    if(!global.JSON.parse){
        global.JSON.parse = function(data){
            return (new Function("return " + data))();
        }
    }
})(_qc);
(function ( module) {
    var global = module["__1"];
    global.Qiyi = global.Qiyi || {};
    global.Q = global.Qiyi;
    var lib = global.Qiyi;

    lib.vcopClient = module["__2"];
    lib.__callbacks__ = module["__15"];
    module["__36"];
    module["__37"];
    module["__38"];
    module["__39"];
    module["__0"] = lib;
})(_qc);})(this);