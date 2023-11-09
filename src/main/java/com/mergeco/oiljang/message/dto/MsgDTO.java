package com.mergeco.oiljang.message.dto;

import com.mergeco.oiljang.product.dto.ProductDTO;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MsgDTO {
    private int msgCode;
    private String msgContent;
    private String msgStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate msgTime;
    //private MsgProInfoDTO products;
    private MsgUserDTO msgUser;
    private MsgDeleteDTO msgDeleteDTO;

}
