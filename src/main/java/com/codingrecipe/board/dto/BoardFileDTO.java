package com.codingrecipe.board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BoardFileDTO {

    private Long id;
    private Long boardId;
    private String originalFileName;
    private String storedFileName;

    @Builder
    public BoardFileDTO(Long id, Long boardId, String originalFileName, String storedFileName) {
        this.id = id;
        this.boardId = boardId;
        this.originalFileName = originalFileName;
        this.storedFileName = storedFileName;
    }
}
