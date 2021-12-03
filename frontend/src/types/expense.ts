import {Sale} from "./sale";

export type Expense = {
  id: number;
  name: string;
  valor_esperado: number;
  valor_real: number;
  data_pagamento: string;
}

export type ExpenseSum = {
  month: string;
  sum: number;
}

export type ExpensePage = {
  value?: Expense[];
  last: boolean;
  totalPages: number;
  totalElements: number;
  first: boolean;
  numberOfElements?: number;
  size?: number;
  number: number;
  empty?: boolean;
}
