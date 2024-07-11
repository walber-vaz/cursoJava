package br.com.wssoftwares.designerpattern.factory;

import br.com.wssoftwares.designerpattern.factory.buttons.Button;
import br.com.wssoftwares.designerpattern.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
