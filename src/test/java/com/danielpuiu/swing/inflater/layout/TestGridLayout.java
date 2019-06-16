package com.danielpuiu.swing.inflater.layout;

import com.danielpuiu.swing.inflater.xml.ComponentLoader;
import org.junit.Test;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGridLayout {

    @Test
    public void testGridLayout() {
        ComponentLoader loader = new ComponentLoader();
        JPanel container = loader.load(StartSwingApplication.class.getClassLoader().getResourceAsStream("grid_layout.xml"));
        assertEquals(5, container.getComponentCount());

        List<String> names = Arrays.asList("Button 1", "Button 2", "Button 3", "Button 4", "Button 5");
        for (int i = 0; i < 5; i++) {
            Component component = container.getComponent(i);
            assertTrue(component instanceof JButton);
            assertEquals(names.get(i), component.getName());
        }

        LayoutManager layoutManager = container.getLayout();
        assertEquals(GridLayout.class, layoutManager.getClass());
    }
}