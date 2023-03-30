package org.zerock.b01.domain;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Favorite", indexes = {
        @Index(name = "idx_favorite_board_bno", columnList = "board_bno")
})
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "board")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;


    private String writer;



}
