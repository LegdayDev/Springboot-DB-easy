package site.metacoding.orange.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //IoC에 자동으로 띄어줌
public interface BoardDao extends JpaRepository<Board, Integer> { 
	//첫번쨰 매개변수:Entity 타입, 2번째 매개변수 :PK타입
	//Jpa가 자동으로 DAO 생성한다.
	//알아서 CURE형식으로 생성해준다
}
