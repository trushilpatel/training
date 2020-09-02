import { User } from "../user.model";
import * as AuthAction from "./auth.actions";

export interface State {
  user: User;
}
const initialState: State = {
  user: null,
};

export function authReducer(
  state = initialState,
  action: AuthAction.AuthActionsType
) {
  switch (action.type) {
    case AuthAction.LOGIN:
      const user = new User(
        action.payload.email,
        action.payload.userId,
        action.payload.token,
        action.payload.expirationDate
      );

      return {
        ...state,
        user,
      };

    case AuthAction.LOGOUT: {
      let user = new User(null, null, null, null);

      return {
        ...state,
        ...user
      };
    }

    default:
      return state;
  }
}
