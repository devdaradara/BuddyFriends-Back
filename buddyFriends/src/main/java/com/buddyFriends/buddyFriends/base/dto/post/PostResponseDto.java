package com.buddyFriends.buddyFriends.base.dto.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponseDto {
    private Long postId;
    private String userId;
    private Integer petId;
    private String title;
    private String content;
    private String periodStart;
    private String periodEnd;
    private String helperSex;
    private boolean done;
    private String pickId;
    private boolean careDone;

    private boolean smellDone;
}


