package timbuchalka.interfacesVsAbstractClasses.abstractClassChallenge;

public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}