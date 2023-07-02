package Lesson6.hw;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class FilteredList {
    private List<Laptop> filteredList;

    public FilteredList(List<Laptop> filteredList) {
        this.filteredList = filteredList;
    }

    /**
     * Создает словарь, где ключ типа String принимает значение наименования фильтруемого параметра, а значение типа
     * ArrayList<String> принимает значения, вводимые пользователем.
     * Запрашивает у пользователя наименование фильтруемого элемента, передает это наименование в ранее созданный словарь.
     * Замупскает фильтр
     */
    public void Filter() {
        Map<String, ArrayList<String>> paramsForFilter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        PrintFilterMenu();
        int answer = scanner.nextInt();
        switch (answer) {
            case (1) -> {
                AddToFilter(paramsForFilter, "ram", 2);
                FilterThis(paramsForFilter);
            }
            case (2) -> {
                AddToFilter(paramsForFilter, "hdd", 2);
                FilterThis(paramsForFilter);
            }
            case (3) -> {
                AddToFilter(paramsForFilter, "os", 1);
                FilterThis(paramsForFilter);
            }
            case (4) -> {
                AddToFilter(paramsForFilter, "color", 1);
                FilterThis(paramsForFilter);
            }
            default -> System.out.println("Пункт меню не найден");
        }
    }

    /**
     * @param paramsForFilter словарь, который метод заполняет
     * @param parameter       значение наименования параметра, по которму будут фильроваться значения
     * @param count           Количество возможных значений парметра: 1 - для параметров, по которым невозможно установить интервал,
     *                        2 - для параметров, по которым возможно установить минимальное и максималььное значение для фильтра
     */
    public void AddToFilter(Map<String, ArrayList<String>> paramsForFilter, String parameter, int count) {
        Scanner scanner = new Scanner(System.in);
        if (count == 1) {
            System.out.println("Введите  значение: ");
            ArrayList<String> searchParameters = new ArrayList<>();
            searchParameters.add(scanner.nextLine());
            paramsForFilter.put(parameter, searchParameters);
        } else if (count == 2) {
            ArrayList<String> searchParameters = new ArrayList<>();
            System.out.println("Введите  минимальное значение: ");
            searchParameters.add(scanner.nextLine());
            System.out.println("Введите  максимальное значение: ");
            searchParameters.add(scanner.nextLine());
            paramsForFilter.put(parameter, searchParameters);
        }
    }

    /**
     * Выводит на экран перечень парметров, по которым можно отфильтровать ноутбуки
     */
    public void PrintFilterMenu() {
        System.out.println("""
                Параметры для поиска:
                1 - ОЗУ
                2 - Объем ЖД
                3 - Операционная система
                4 - Цвет
                5 - Вернуться в главное меню
                Выберете соответствующую цифру:\s""");
    }

    /**
     * @param paramsForFilter словарь, который содержит наименование параметра, по которому нужно отфильровать ноутбуки, и его значения
     *                        Удаляет из списка фильтруемых ноутбуков те ноутбуки, у которых значения фильтруемых параметров не соответствуют заданным в словаре.
     */
    public void FilterThis(Map<String, ArrayList<String>> paramsForFilter) {
        for (String s : paramsForFilter.keySet()) {
            switch (s) {
                case "ram":
                    int minValue = Integer.parseInt(paramsForFilter.get(s).get(0));
                    int maxValue = Integer.parseInt(paramsForFilter.get(s).get(1));
                    int i = 0;
                    while (i < filteredList.size()) {
                        int laptopvalue = filteredList.get(i).getRam();
                        if (laptopvalue < minValue || laptopvalue > maxValue) {
                            filteredList.remove(i);
                        } else i++;
                    }
                    break;
                case "hdd":
                    minValue = Integer.parseInt(paramsForFilter.get(s).get(0));
                    maxValue = Integer.parseInt(paramsForFilter.get(s).get(1));
                    int j = 0;
                    while (j < filteredList.size()) {
                        int laptopvalue = filteredList.get(j).getHdd();
                        if (laptopvalue < minValue || laptopvalue > maxValue) {
                            filteredList.remove(j);
                        } else j++;
                    }
                    break;
                case "os":
                    String value = paramsForFilter.get(s).get(0);
                    int k = 0;
                    while (k < filteredList.size()) {
                        String laptopvalue = filteredList.get(k).getOs();
                        if (!laptopvalue.toLowerCase().equals(value.toLowerCase())) {
                            filteredList.remove(k);
                        } else k++;
                    }
                    break;
                case "color":
                    value = paramsForFilter.get(s).get(0);
                    int m = 0;
                    while (m < filteredList.size()) {
                        String laptopvalue = filteredList.get(m).getColor();
                        if (!laptopvalue.toLowerCase().equals(value.toLowerCase())) {
                            filteredList.remove(m);
                        } else m++;
                    }
                    break;
                default:
                    break;
            }

        }

    }

    /**
     * Выводит на экран перечень от фильтрованных ноутбуков, если список пустой, выводит информацию о том, что ничего не найдено.
     */
    public void PrintFilteredList() {
        if (!filteredList.isEmpty()) {
            for (Laptop laptop : filteredList) {
                System.out.println(laptop.toString());
            }
        } else System.out.println("Ничего не найдено");
    }

}

