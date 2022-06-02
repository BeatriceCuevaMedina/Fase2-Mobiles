package com.example.autenticacion.listener;

import com.example.autenticacion.model.CartModel;
import com.example.autenticacion.model.DrinkModel;

import java.util.List;

public interface ICartListener {
    void onCartLoadSuccess(List<CartModel> cartModelList);
    void onCartFailed(String message);
}
