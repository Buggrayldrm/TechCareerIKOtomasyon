package com.example.IKOtomasyon.IKOtomasyon.Controller;

import com.example.IKOtomasyon.IKOtomasyon.Dto.Request.SalaryCreateRequest;
import com.example.IKOtomasyon.IKOtomasyon.Dto.Response.SalaryResponseDto;
import com.example.IKOtomasyon.IKOtomasyon.Entities.Salary;
import com.example.IKOtomasyon.IKOtomasyon.Services.concretes.SalaryBusiness;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salaryApi")
@RequiredArgsConstructor
public class SalaryController {

    private final SalaryBusiness salaryBusiness;

    @GetMapping("/getAllSalary")
    public List<SalaryResponseDto> getAllSalary(){
        return salaryBusiness.getAllSalary();
    }
    @GetMapping("getByIdSalary/{id}")
    public SalaryResponseDto getByIdSalary(@PathVariable Long id){
        return  salaryBusiness.getByIdSalary(id);
    }
    @DeleteMapping("/deleteOneSalary/{id}")
    public void deleteOneSalary(@PathVariable Long id){
        salaryBusiness.deleteOneSalary(id);
    }

    @PostMapping("/(createOneSalary")
    public Salary createOneSalary(SalaryCreateRequest salaryCreateRequest){
        return  salaryBusiness.createOneSalary(salaryCreateRequest);

    }

    @PutMapping("/updateOneSalary/{id}")
    public Salary updateOneSalary(Long id, Salary newSalary){
        return salaryBusiness.updateOneSalary(id,newSalary);
    }


}
