import {Expense} from "./expense";

export type Incoming = {
  id: number;
  name: string;
  valor_esperado: number;
  valor_real: number;
  data: string;
}

export type IncomingSum = {
  month: string;
  sum: number;
}

export type IncomingPage = {
  value?: Incoming[];
  last: boolean;
  totalPages: number;
  totalElements: number;
  first: boolean;
  numberOfElements?: number;
  size?: number;
  number: number;
  empty?: boolean;
}
