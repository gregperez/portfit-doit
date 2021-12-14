package com.gperez.portfitdoit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Portfolio {
    List<Stock> stocks;
    Double profit;
}
