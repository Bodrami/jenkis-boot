package com.ohgiraffers.bootproject.service;

import com.ohgiraffers.bootproject.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    /* CI/CD는 테스트 코드가 기본으로 들어가 있어야 한다. cmd+shift+T 자동 테스트 생성*/
    public int plus(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }
}
