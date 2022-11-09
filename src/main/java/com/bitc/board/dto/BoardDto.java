package com.bitc.board.dto;

import lombok.Data;

//  @Data : lombok 라이브러리에서 지원하는 어노테이션으로 해당 클래스의 멤버 변수에 대한 getter/setter/toString() 메서드를 자동으로 생성
//          하는 어노테이션. 클래스 자체를 데이터타입으로 사용하기 위해 사용. HashMap과 다르게 타입이 다른 변수들 저장 가능.
//          @Getter, @Setter, @ToString 어노테이션을 모두 사용한 효과.
@Data
public class BoardDto {
//    테이블의 변수 전부 작성. '_'가 포함된 것들은 카멜표기법으로 표시
    private int idx;
    private String title;
    private String contents;
    private String userId;
    private String pwd;
    private String createDt;
    private String updateDt;
    private int hitCnt;
}
