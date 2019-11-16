package com.satya.structural.bridge;

import java.util.List;

public class htmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Details> details) {
        StringBuilder builder = new StringBuilder();
        builder
                .append("<Header>").append(header).append("</Header>").append("\n");
        details.forEach(el->builder.append("<"+el.getLabel()+">").append(el.getValue()).append("</"+el.getLabel()+">").append("\n"));
        return builder.toString();
    }
}
