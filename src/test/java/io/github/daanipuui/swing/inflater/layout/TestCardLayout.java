package io.github.daanipuui.swing.inflater.layout;

import io.github.daanipuui.swing.inflater.xml.ComponentLoader;
import org.junit.Test;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.LayoutManager;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCardLayout {

    @Test
    public void testCardLayout() {
        ComponentLoader loader = new ComponentLoader();
        JPanel container = loader.load(getClass().getClassLoader().getResourceAsStream("card_layout.xml"));
        assertEquals(3, container.getComponentCount());

        List<String> names = Arrays.asList("first", "second", "third");
        for (int i = 0; i < 3; i++) {
            Component component = container.getComponent(i);
            assertTrue(component instanceof JPanel);
            assertEquals(names.get(i), component.getName());
        }

        LayoutManager layoutManager = container.getLayout();
        assertEquals(CardLayout.class, layoutManager.getClass());
    }
}
