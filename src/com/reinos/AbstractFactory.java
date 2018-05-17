package com.reinos;

import com.reinos.elfos.Elfo;
import com.reinos.orcos.Orco;

public interface AbstractFactory {

    Elfo getElfo();
    Orco getOrco();

}
