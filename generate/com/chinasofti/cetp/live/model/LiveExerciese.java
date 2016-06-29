package com.chinasofti.cetp.live.model;

import com.chinasofti.cetp.study.model.ExerciseStu;
import com.chinasofti.cetp.study.model.ExerciseWithBLOBs;

public class LiveExerciese extends ExerciseWithBLOBs {
	private Integer liveCourseId;

	private ExerciseStu exerciseStu;
	
	public ExerciseStu getExerciseStu() {
		return exerciseStu;
	}

	public void setExerciseStu(ExerciseStu exerciseStu) {
		this.exerciseStu = exerciseStu;
	}

	public Integer getLiveCourseId() {
		return liveCourseId;
	}

	public void setLiveCourseId(Integer liveCourseId) {
		this.liveCourseId = liveCourseId;
	}
}
