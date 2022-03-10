
package com.xworkz.Crudoperation.Examples;

public class FlipkartDAOImpl {
	MobileDTO[] dtos = new MobileDTO[2];

	int index = 0;

	String add(MobileDTO dt) {
		try {
			dtos[index] = dt;
			index++;
			return "data saved";
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			return "You have exception" + e.getClass().getSimpleName() + e.getMessage();
		}

	}

	public void PrintAll() {
		try {
			for (int i = 0; i < dtos.length; i++) {
				System.out.println(dtos[i]);
			}

		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getSimpleName() + e.getMessage());
		}

	}

	public MobileDTO getBybrandName(String brandName) {
		MobileDTO dto = null;
		try {
			for (int index = 0; index < dtos.length; index++) {
				if (dtos[index] != null && brandName.equals(dtos[index].getBrandName())) {
					dto = dtos[index];
					return dto;
				}
			}
		} catch (Exception e) {
			System.out.println("you have an exception in" + this.getClass().getSimpleName());
			System.out.println("Exception" + e.getClass().getSimpleName() + "reason" + e.getMessage());
		}
		return dto;
	}

	public MobileDTO deleteBycolor(String clr) {
		MobileDTO dt = null;
		try {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null && clr.equals(dtos[i].getColor())) {
					dtos[i] = null;
				}

			}
		} catch (Exception e) {
			System.out.println("you have an exception in" + this.getClass().getSimpleName());
			System.out.println("Exception" + e.getClass().getSimpleName() + "reason" + e.getMessage());
		}
		return dt;

	}

	public MobileDTO updateByBrandName(String oldName,String newName) {
		MobileDTO dt = null;
		try {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null && oldName.equals(dtos[i].getBrandName())) {
					dtos[i].setBrandName(newName);
					return dtos[i];
				}

			}
		} catch (Exception e) {
			System.out.println("you have an exception in" + this.getClass().getSimpleName());
			System.out.println("Exception" + e.getClass().getSimpleName() + "reason" + e.getMessage());
		}
		return dt;

	}

}
