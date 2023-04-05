package mvc.view;

import mvc.dto.MusicalDTO;
import mvc.dto.UsersDTO;

import java.util.List;

public class SuccessView {
    /**
     * 성공 메시지 출력
     * */
    public static void messagePrint(String message) {
        System.out.println(message);
    }

    /**
     * 성공한 유저 정보 출력
     * */
    public static void selectByUserIdPrint(UsersDTO userDTO) {
        System.out.println(userDTO);
    }

    /**
     * 뮤지컬 목록 출력
     * */
    public static void selectPrint(List<String> list) {
        System.out.println("\n================================ 뮤지컬 목록 ===================================");
        for(String title  : list) {
            System.out.println(title);
        }
    }

    /**
     * 뮤지컬 상세 조회
     * */
    public static void selectMusicalDetailPrint(MusicalDTO musicalDTO) {
        System.out.printf("\n============================= %s 상세 조회 ================================\n", musicalDTO.getTitle());
        System.out.println(musicalDTO);
    }

}