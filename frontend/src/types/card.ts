import {Expense} from "./expense";

export type Card = {
  id: number;
  name: string;
  saldo: number;
  fatura_atual: number;
  fatura_total: number;
  taxa_juros: number;
  taxa_banco: number;
  vencimento: string;
  fechamento: string;
}

export type CardInvoiceSum = {
  month: string;
  invoiceSum: number;
}

export type CardPage = {
  value?: Card[];
  last: boolean;
  totalPages: number;
  totalElements: number;
  first: boolean;
  numberOfElements?: number;
  size?: number;
  number: number;
  empty?: boolean;
}
