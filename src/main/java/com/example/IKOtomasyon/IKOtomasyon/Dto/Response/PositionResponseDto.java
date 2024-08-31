package com.example.IKOtomasyon.IKOtomasyon.Dto.Response;

import com.example.IKOtomasyon.IKOtomasyon.Entities.Personal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PositionResponseDto {

    private Long positionId;
    private Long personalTc;
    private String position_name;
}
