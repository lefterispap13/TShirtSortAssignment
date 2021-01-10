/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.util.Objects;

public class TShirt {
    private String name;
    private Color color;
    private Size size;
    private Fabric fabric;

    public TShirt() {
    }

    public TShirt(String name, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 2 * hash + Objects.hashCode(this.name);
        hash = 2 * hash + Objects.hashCode(this.color);
        hash = 2 * hash + Objects.hashCode(this.size);
        hash = 2 * hash + Objects.hashCode(this.fabric);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TShirt other = (TShirt) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("TShirt{name=").append(name);
//        sb.append(", color=").append(color);
//        sb.append(", size=").append(size);
//        sb.append(", fabric=").append(fabric);
//        sb.append('}');
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "TShirt{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", fabric=" + fabric +
                '}';
    }

    public String print(){
        return "TShirt{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", fabric=" + fabric +
                '}'+"\n";
    }
}
