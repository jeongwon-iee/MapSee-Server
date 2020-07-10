package mapsee.protocol;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Trip {
    String period;
    int personnel;
//    List<>

    String title;
    String text;
    String imgUrl; //TODO 타임테이블..?
    int numberOfLikes;
}
