import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlaceholderDatePicker extends JXDatePicker {
    private String placeholderText;

    public PlaceholderDatePicker(String placeholderText) {
        this.placeholderText = placeholderText;
        setFormats(new SimpleDateFormat("yyyy-MM-dd"));
        setDate(null);
        getEditor().setText(placeholderText);
        initListeners();
    }

    private void initListeners() {
        getEditor().addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (getEditor().getText().equals(placeholderText)) {
                    getEditor().setText("");
                    getEditor().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getEditor().getText().isEmpty()) {
                    getEditor().setText(placeholderText);
                    getEditor().setForeground(Color.GRAY);
                }
            }
        });
    }

    @Override
    public void setDate(Date date) {
        super.setDate(date);
        if (date != null) {
            getEditor().setForeground(Color.BLACK);
        } else {
            getEditor().setText(placeholderText);
            getEditor().setForeground(Color.GRAY);
        }
    }
}
