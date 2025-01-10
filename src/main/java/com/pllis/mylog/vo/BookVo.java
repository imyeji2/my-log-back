package com.pllis.mylog.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Domain(Entity)? DB의 정보를 매핑하기 위한 클래스
 */
@Getter
@NoArgsConstructor
@Entity
@Table(name = "book")
public class BookVo {

    @Id
    @GeneratedValue
    @Column(name = "book_no")
    private Long bookNo;

    @Column(name = "book_title", length = 100, nullable = false)
    private String bookTitle;

}

// @Data
// @NoArgsConstructor
// public class BookVo {

//     @NotEmpty
//     @Schema(title = "책 PK")
//     private Long bookNo;

//     @NotEmpty
//     @Schema(title = "책제목")
//     private String bookTitle;

//     @NotEmpty
//     @Schema(title = "책제목")
// 	private String title;

//     @Schema(title = "책제목")
// 	private String link;

//     @Schema(title = "책제목")
//     private String image;

//     @Schema(title = "책제목")
// 	private String author;

//     @Schema(title = "책제목")
// 	private String discount;

//     @Schema(title = "책제목")
// 	private String publisher;

//     @Schema(title = "책제목")
// 	private String pubdate;

//     @Schema(title = "책제목")
// 	private String isbn;

//     @Schema(title = "책제목")
// 	private String description;
// }