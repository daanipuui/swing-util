package com.danielpuiu.swing.inflater.type.conversion;

import com.danielpuiu.swing.inflater.PackageProvider;
import com.danielpuiu.swing.inflater.type.TypeConversion;

import java.awt.Color;
import java.util.Collections;
import java.util.List;

public class ColorConversion implements TypeConversion<Color> {

    @Override
    public List<Class> getHandledTypes() {
        return Collections.singletonList(Color.class);
    }

    @Override
    public Color convertLiteral(PackageProvider packageProvider, String value) {
        return convertLiteral(Color::getColor, value);
    }
}
