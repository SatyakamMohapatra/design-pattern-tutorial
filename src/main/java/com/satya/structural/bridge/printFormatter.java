package com.satya.structural.bridge;

import java.util.List;

public class printFormatter implements Formatter {

    @Override
    public String format(String header, List<Details> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("Header").append(":").append(header).append("\n")
                .append("--------------------------").append("\n");
        details.forEach(el->builder.append(el.getLabel()).append(":").append(el.getValue()).append("\n"));
        return builder.toString();
    }
}
