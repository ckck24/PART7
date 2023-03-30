package org.zerock.b01.repository;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b01.domain.Board;
import org.zerock.b01.domain.Favorite;

@SpringBootTest
@Log4j2
public class FavoriteRepositoryTests {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Test
    public void testInserts() {

        for(long bno = 204L ; bno <= 303; bno++){

            for(int j= 0; j < 3; j++) {
                Board board = Board.builder().bno(bno).build();

                Favorite favorite = Favorite.builder()
                        .writer("user00")
                        .board(board)
                        .build();

                favoriteRepository.save(favorite);
            }

        }//end for


    }

}
