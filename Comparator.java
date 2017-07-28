class Checker implements Comparator<Player>{        
    public int compare(Player obj1, Player obj2){     
        return obj1.score!=obj2.score ? (obj2.score-obj1.score) : obj1.name.compareTo(obj2.name);
    }
}
