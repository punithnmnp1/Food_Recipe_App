package com.example.reciepeapp.Listeners;

import com.example.reciepeapp.Models.InstructionsResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);

}
