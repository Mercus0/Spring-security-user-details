package com.jdc.weekend.model.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Review {
	
	@EmbeddedId
	private ReviewPk id;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="post_id",referencedColumnName = "id",insertable = false,updatable = false)
	private Post post;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="review_id",referencedColumnName = "id",insertable = false,updatable = false)

	private Member reviewer;
	
	@Column(nullable = false)
	private BigDecimal rate;
	
	private String message;
}
