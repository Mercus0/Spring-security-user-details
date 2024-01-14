package com.jdc.weekend.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ReviewPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="post_id",nullable = false)
	private int postId;
	@Column(name="review_id",nullable = false)
	private int reviewerId;
	
	public String getCode() {
		return "%04d-%06d".formatted(reviewerId,postId);
	}
	
	public static ReviewPk from(String code) {
		var array=code.split("-");
		var pk=new ReviewPk();
		pk.setReviewerId(Integer.parseInt(array[0]));
		pk.setPostId(Integer.parseInt(array[1]));
		return pk;
	}

}
