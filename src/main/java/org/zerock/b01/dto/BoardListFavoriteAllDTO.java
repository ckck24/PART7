package org.zerock.b01.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BoardListFavoriteAllDTO extends BoardListAllDTO{

    private Long favoriteCount;
}
