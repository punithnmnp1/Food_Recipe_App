package com.example.reciepeapp.Listeners;

import com.example.reciepeapp.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipeListener {
    void didFetch(List<SimilarRecipeResponse> response, String message );
    void didError(String message);
}
