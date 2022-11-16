package com.bitc.board.mapper;

import com.bitc.board.dto.BoardDto;
import com.bitc.board.dto.BoardFileDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//  @Mapper : mybatis ORM을 사용하여 xml 파일과 연동된 인터페이스임을 알려주는 어노테이션

//  Mapper 파일이 하는 일
//      1. DB의 데이터 객체와 java의 데이터 객체의 형태가 다르기 때문에 데이터를 변환
//      2. java에서 DB에 명령을 보낼 수 있는 형태의 메서드를 제공
@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;

    BoardDto selectBoardDetail(int idx) throws Exception;

    void insertBoard(BoardDto board) throws Exception;

    void updateBoard(BoardDto board) throws Exception;

    void deleteBoard(int idx) throws Exception;

    void updateHitCount(int idx) throws Exception;

    void insertBoardFileList(List<BoardFileDto> fileList) throws Exception;

    List<BoardFileDto> selectBoardFileList(int boardIdx) throws Exception;
}
