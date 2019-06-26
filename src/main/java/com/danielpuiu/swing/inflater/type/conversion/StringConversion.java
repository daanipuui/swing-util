package com.danielpuiu.swing.inflater.type.conversion;

import com.danielpuiu.swing.inflater.PackageProvider;
import com.danielpuiu.swing.inflater.type.TypeConversion;

import java.util.Arrays;
import java.util.List;

public class StringConversion implements TypeConversion<String> {

    @Override
    public List<String> getHandledTypes() {
        return Arrays.asList(String.class.getName(), String.class.getSimpleName(), "string");
    }

    @Override
    public String convertLiteral(PackageProvider packageProvider, String value) {
        return value;
    }
}
