//sortDeck(d, true);// dummy parameter: the boolean indicates that ranks should get priorities over suits.
        //  1   2   3   4   5   6   7   8   9
        int c = 0;
        int temp = d.cards[0].rank;
        for (int i = 1; i < d.cards.length; i++) {
            if (d.cards[i].rank == temp+1) c++;
            temp++;
        }
        return (c>4);
        /*
        int holdIndex = 0;
        int[] hist = rankHist(d);
        for (;holdIndex+4<hist.length;) {
            for (int i = holdIndex; i < hist.length; i++) {
                if (hist[i] > 0) {
                    holdIndex=i;
                    i = hist.length;
                }
            }
            if (hist[holdIndex] > 1 && hist[holdIndex+1] > 1 && hist[holdIndex+2] > 1 && hist[holdIndex+3] > 1 && hist[holdIndex+4] > 1) return true;
        } */
        //return false;
        
        
        
        
        int h = d.cards.length;
        for (int i = 0; i<h; i++){
            swapElement(d, findLowestCard(d, i, h, true), i);
        }
        
        
        
        Card lc = d.cards[l];
        for (int i = l; i < h-1; i++){
            if (Card.compareCard(lc, d.cards[i+1], true) == 1) lc = d.cards[i+1];
        }
        return (findBisect(d, lc));
        
        
        
        int h = d.cards.length;
        for (int i = 0; i<h; i++){
            swapElement(d, findLowestCard(d, i, h), i);
        }
        
        
        
        
        Card lc = d.cards[l];
        for (int i = l; i < h-1; i++){
            if (Card.compareCard(lc, d.cards[i+1]) == 1) lc = d.cards[i+1];
        }
        return (findBisect(d, lc));
        
        
        
        