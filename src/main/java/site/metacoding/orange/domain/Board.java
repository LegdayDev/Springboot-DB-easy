package site.metacoding.orange.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Board {
	@Id //PRIMARY KEY 위에 어노테이션 작성
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id가 sequence 가 적용됨
	private Integer id;
	private String title;
	private String content;
	private String author;
}
