package com.example.IKOtomasyon.IKOtomasyon.Controller;


import com.example.IKOtomasyon.IKOtomasyon.Dto.Request.PositionCreateRequest;
import com.example.IKOtomasyon.IKOtomasyon.Dto.Response.PositionResponseDto;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Position;
import com.example.IKOtomasyon.IKOtomasyon.Services.concretes.PositionBusiness;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/positionApi")
@RequiredArgsConstructor
public class PositionController {
    private  final PositionBusiness positionBusiness;

    @GetMapping("/getAllPosition")
    public List<PositionResponseDto> getAllPosition(){
        return positionBusiness.getAllPosition();
    }

    @GetMapping("/getByIdPosition/{id}")
    public PositionResponseDto getByIdPosition(@PathVariable Long id){
        return positionBusiness.getByIdPosition(id);
    }

    @GetMapping("/deleteOnePosition/{id}")
    public void deleteOnePosition(@PathVariable Long id){
        positionBusiness.deleteOnePosition(id);
    }

    @GetMapping("/createPosition")
    public Position createOnePosition(PositionCreateRequest positionCreateRequest){
        return positionBusiness.createOnePosition(positionCreateRequest);
    }

    @PutMapping("/updatePosition/{id}")
    public Position updateOnePosition(Long id, Position newPosition){
        return positionBusiness.updateOnePosition(id,newPosition);
    }


}
