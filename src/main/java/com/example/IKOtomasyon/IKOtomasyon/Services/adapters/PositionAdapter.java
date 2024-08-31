package com.example.IKOtomasyon.IKOtomasyon.Services.adapters;

import com.example.IKOtomasyon.IKOtomasyon.Dto.Request.PositionCreateRequest;
import com.example.IKOtomasyon.IKOtomasyon.Dto.Response.PositionResponseDto;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Position;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Salary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PositionAdapter {

    public List<PositionResponseDto> convertToListResponseDto(List<Position> positions){
        List<PositionResponseDto> responseDtos=new ArrayList<>();
        for (Position position:positions){
            PositionResponseDto dto=convertToResponceDto(position);
            responseDtos.add(dto);
        }
        return responseDtos;
    }


    public Position convertToEntity(PositionCreateRequest positionCreateRequest){
        Position position=new Position();
        position.setPosition_id(positionCreateRequest.getPosition_id());
        position.setPosition_name(positionCreateRequest.getPosition_name());
        position.setPersonal_id(positionCreateRequest.getPersonalId());
        return position;
    }

    public PositionResponseDto convertToResponceDto(Position position){
        return new PositionResponseDto(position.getPosition_id(),position.getPersonal_id().getTc(),position.getPosition_name());
    }
}
