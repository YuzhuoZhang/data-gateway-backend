package com.gateway.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Z
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskVO {

    Integer id;

    String name;

}