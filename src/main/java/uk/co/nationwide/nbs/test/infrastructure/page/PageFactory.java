package uk.co.nationwide.nbs.test.infrastructure.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageFactory {

    private Map<String, Page> pages;

    public PageFactory(List<Page> pages) {
        this.pages = new HashMap<>();
        for (Page page : pages) {
            this.pages.put(page.name(), page);
        }
    }

    public Page get(String page) {
        if (this.pages.containsKey(page)) {
            return this.pages.get(page);
        }
        throw new AssertionError(String.format("requested page %s is not available", page));
    }

}
