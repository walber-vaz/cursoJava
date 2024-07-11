package br.com.wssoftwares.designerpattern.factory;

import br.com.wssoftwares.designerpattern.factory.buttons.Button;
import br.com.wssoftwares.designerpattern.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
