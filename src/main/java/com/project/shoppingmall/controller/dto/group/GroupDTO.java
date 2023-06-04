package com.project.shoppingmall.controller.dto.group;
import com.project.shoppingmall.entity.BaseTime;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class GroupDTO extends BaseTime {
        private String g_title;
        private String g_name;
        private Integer g_member;
        private Date g_dueDate;
        private String g_address;
}
