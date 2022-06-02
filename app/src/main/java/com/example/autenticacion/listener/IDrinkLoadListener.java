package com.example.autenticacion.listener;

import com.example.autenticacion.model.DrinkModel;

import java.util.List;

public interface IDrinkLoadListener {
    void onDrinkLoadSuccess(List<DrinkModel> drinkModelList);
    void onDrinkFailed(String message);
}
