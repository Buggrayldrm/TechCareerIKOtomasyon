package com.example.IKOtomasyon.IKOtomasyon.Dto.Request;


import com.example.IKOtomasyon.IKOtomasyon.Entities.Personal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionCreateRequest {
private Long position_id;
private Personal personalId;
private  String position_name;

}
