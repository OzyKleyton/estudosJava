package com.estudo.basico.estudosBasico.controller;

import com.estudo.basico.estudosBasico.util.TratamendoDouble;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {


    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    ) throws IllegalArgumentException {
        if(!TratamendoDouble.isNumeric(numberOne) || !TratamendoDouble.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");

        return TratamendoDouble.convertToDouble(numberOne) + TratamendoDouble.convertToDouble(numberTwo);
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws IllegalArgumentException {
        if(!TratamendoDouble.isNumeric(numberOne) || !TratamendoDouble.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return TratamendoDouble.convertToDouble(numberOne) - TratamendoDouble.convertToDouble(numberTwo);
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws IllegalArgumentException {
        if(!TratamendoDouble.isNumeric(numberOne) || !TratamendoDouble.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return TratamendoDouble.convertToDouble(numberOne) / TratamendoDouble.convertToDouble(numberTwo);
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws IllegalArgumentException {
        if(!TratamendoDouble.isNumeric(numberOne) || !TratamendoDouble.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return TratamendoDouble.convertToDouble(numberOne) * TratamendoDouble.convertToDouble(numberTwo);
    }

    @RequestMapping("/med/{numberOne}/{numberTwo}")
    public Double median(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws IllegalArgumentException {
        if(!TratamendoDouble.isNumeric(numberOne) || !TratamendoDouble.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value");
        return  (TratamendoDouble.convertToDouble(numberOne) + TratamendoDouble.convertToDouble(numberTwo)) / 2;
    }

    @RequestMapping("/raiz/{numberOne}")
    public Double raiz(
            @PathVariable("numberOne") String numberOne
    ) throws IllegalArgumentException {
        if(!TratamendoDouble.isNumeric(numberOne)) throw new UnsupportedOperationException("Please set a numeric value");
        return  Math.sqrt(TratamendoDouble.convertToDouble(numberOne));
    }
}
