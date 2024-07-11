package br.com.wssoftwares.designerpattern.factory;

import br.com.wssoftwares.designerpattern.factory.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
