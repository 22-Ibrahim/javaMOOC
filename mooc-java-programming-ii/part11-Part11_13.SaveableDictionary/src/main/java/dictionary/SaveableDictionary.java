/*
 * Copyright (C) 2020 Dantes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Dantes
 */
 

public class SaveableDictionary {

 

    private HashMap<String, String> dictionary;
    private HashMap<String, String> dictionary_two;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.dictionary_two = new HashMap<>();
        this.file = null;
    }

    public SaveableDictionary(String File) {
        this.dictionary = new HashMap<>();
        this.dictionary_two = new HashMap<>();
        this.file = File;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary_two.putIfAbsent(translation, words);

    }

    public String translate(String word) {
        String toRet = this.dictionary.getOrDefault(word, null);
        if (toRet == null) {
            toRet = this.dictionary_two.getOrDefault(word, null);
        }

        return toRet;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            String val = this.dictionary.get(word);
            this.dictionary_two.remove(val);
            this.dictionary.remove(word);
        }

        if (this.dictionary_two.containsKey(word)) {
            String val = this.dictionary_two.get(word);
            this.dictionary.remove(val);
            this.dictionary_two.remove(word);
        }
    }

    public boolean load() {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(this.file))
                    .forEach(row -> rows.add(row));

            for (String line : rows) {
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Errore : File non trovato ! " + e.getLocalizedMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.dictionary.keySet()) {
                writer.println(printToDic(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("File non trovato ! " + e.getLocalizedMessage());
            return false;
        }

    }

    public String printToDic(String key) {
        return key + ":" + this.dictionary.get(key);
    }

}

 